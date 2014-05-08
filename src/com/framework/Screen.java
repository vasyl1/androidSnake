/**
 * 
 */
package com.framework;

/**
 * Abstract Class to deal with Screen instances in a Game
 * @author vasyl
 *
 */
public abstract class Screen {
	//  game instance
	 protected final Game game;
	 	/**
	 	 * Constructor for the Screen. Takes an instance of a Game as an argument
	 	 * @param game
	 	 */
	    public Screen(Game game) {
	        this.game = game;
	    }
	    /**
	     * updates the screen with given time
	     * @param deltaTime
	     */
	    public abstract void update(float deltaTime);
	    /**
	     * Presents the screen
	     * @param deltaTime
	     */
	    public abstract void present(float deltaTime);
	    /**
	     * Saves the screen when game is paused
	     */
	    public abstract void pause();
	    /**
	     * resumes after the Game is restarted
	     */
	    public abstract void resume();
	    /**
	     * Disposes of the Screen when a new One is called by the Game
	     */
	    public abstract void dispose();

}
