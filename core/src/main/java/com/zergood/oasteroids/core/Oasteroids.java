package com.zergood.oasteroids.core;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

import java.awt.*;

public class Oasteroids extends Game{
	Texture texture;
	SpriteBatch batch;
	float elapsed;
    FPSLogger fpsLogger;

    public SplashScreen getSplashScreen(){
        return new SplashScreen(this);
    }
	@Override
	public void create () {
        fpsLogger = new FPSLogger();
        setScreen(getSplashScreen());
	}
}
