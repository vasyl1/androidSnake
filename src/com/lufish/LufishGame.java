package com.lufish;

import com.framework.Screen;
import com.framework.impl.AndroidGame;

public class LufishGame extends AndroidGame {

	@Override
	public Screen getStartScreen() {
		// TODO Auto-generated method stub
	
			return new LoadingScreen(this);
		
	}

}
