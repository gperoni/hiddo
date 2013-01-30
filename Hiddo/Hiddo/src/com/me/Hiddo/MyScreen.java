package com.me.Hiddo;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MyScreen implements Screen {

	private MyGdxGame myGame;
	
	protected OrthographicCamera camera;	
	protected SpriteBatch batch;
	
	protected Texture texture;
		
	public MyScreen(MyGdxGame game) {	
		myGame = game;
		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
				
		camera = new OrthographicCamera(w, h);
		camera.setToOrtho(false,  w, h);

		batch = new SpriteBatch();
	}	
	
	@Override
	public void render(float delta) {
	
			Gdx.gl.glClearColor(1, 1, 1, 1);
			Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
			
			batch.setProjectionMatrix(camera.combined);
			
			batch.begin();
			batch.draw(texture, 0, 0);
			batch.end();		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();		
	}

}
