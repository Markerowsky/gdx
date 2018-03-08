package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture car;
	Texture map;
	Texture grid;
	OrthographicCamera mapCamera;
	OrthographicCamera carCamera;


	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		car = new Texture("Audi.png");
		map = new Texture("mapa.png");
		grid = new Texture("libgdxgridtest.png");
		carCamera = new OrthographicCamera();
		mapCamera = new OrthographicCamera();
		float time = 0;


	}

	@Override
	public void render () {
		Gdx.graphics.getDeltaTime();

		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		carCamera.setToOrtho(false, 800, 480);
		carCamera.translate(0, 0);
		carCamera.zoom = 2f;
		carCamera.update();

		mapCamera.setToOrtho(false, 800, 480);
		mapCamera.translate(0, 0);
		mapCamera.update();

		batch.begin();
		batch.draw(map, 0, -100);
		batch.draw(car, 85, 360);
		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
