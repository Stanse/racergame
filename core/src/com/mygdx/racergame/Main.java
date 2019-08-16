package com.mygdx.racergame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.mygdx.racergame.view.GameScreen;

public class Main extends Game {
	private Screen gameScreen;

	
	@Override
	public void create () {
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}

}
