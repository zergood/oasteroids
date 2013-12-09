package com.zergood.oasteroids.core;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

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

        splashTextureRegion = new TextureRegion( splashTexture, 0, 0, 512, 301 );
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        batch.begin();

        batch.draw(splashTexture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        batch.end();
    }

    @Override
    public void dispose()
    {
        super.dispose();
        splashTexture.dispose();
    }
}
