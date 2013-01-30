package com.me.Hiddo;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;


public class GameScreen extends MyScreen {
		
	public GameScreen(MyGdxGame game) {	
		super(game);
				
		LoadContent();
	}
	
	public void LoadContent(){
		
		texture = new Texture(Gdx.files.internal("data/libgdx.png"));
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
}
