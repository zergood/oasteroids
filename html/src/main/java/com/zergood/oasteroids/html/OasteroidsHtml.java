package com.zergood.oasteroids.html;

import com.zergood.oasteroids.core.Oasteroids;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class OasteroidsHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new Oasteroids();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
