package com.zergood.oasteroids.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Scaling;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.*;

/**
 * Created with IntelliJ IDEA.
 * User: zergood
 * Date: 09.12.13
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 */
public class SplashScreen extends AbstractScreen {
     private Texture splashTexture;
     private TextureRegion splashTextureRegion;

     public SplashScreen(Oasteroids game){
        super(game);
     }

    @Override
    public void show() {
        super.show();

        splashTexture = new Texture(Gdx.files.internal("splash.gif"));
        splashTexture.setFilter( Texture.TextureFilter.Linear, Texture.TextureFilter.Linear );
        stage.clear();
        splashTextureRegion = new TextureRegion( splashTexture, 0, 0, 512, 301 );
        Drawable splashTextureRegionDrawable = new TextureRegionDrawable(splashTextureRegion);
        Image splashImage = new Image( splashTextureRegionDrawable, Scaling.stretch);
        splashImage.setFillParent( true );
        splashImage.getColor().a = 0f;
        splashImage.addAction( sequence( fadeIn( 0.75f ), delay( 1.75f ), fadeOut( 0.75f ),
                new Action() {
                    @Override
                    public boolean act( float delta ) {
                        System.out.println("here!");
                        game.setScreen( new MenuScreen( game ) );
                        return true; // returning true consumes the event
                    }
                } )
        );
        stage.addActor(splashImage);
    }


    @Override
    public void dispose()
    {
        super.dispose();
        splashTexture.dispose();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }
}
