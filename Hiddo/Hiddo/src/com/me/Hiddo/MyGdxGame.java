package com.me.Hiddo;

import com.badlogic.gdx.Game;

public class MyGdxGame extends Game {

	private GameScreen gameScreen;
	private MainScreen mainScreen;
	
	@Override
	public void create() {		

		gameScreen = new GameScreen(this);
		mainScreen = new MainScreen(this);
		
		setScreen(mainScreen); 
	}

	@Override
	public void dispose() {
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
