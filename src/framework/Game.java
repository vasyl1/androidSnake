/**
 * 
 */
package framework;

/**
 * @author vasyl
 * Methods and instances needed to create a Game
 *
 */
public interface Game {
	/**
	 * getter for Input instance
	 * @return
	 */
	public Input getInput();
	/**
	 * Getter for FileIO instance
	 * @return
	 */
    public FileIO getFileIO();
    /**
     * getter for Gaphics instance
     * @return
     */
    public Graphics getGraphics();
    /**
     * Getter for Audio instance
     * @return
     */
    public Audio getAudio();
    /**
     * Sets the current screen in the game
     * @param screen
     */
    public void setScreen(Screen screen);
    /**
     * Getter for the active screen in the game
     * @return
     */
    public Screen getCurrentScreen();
    /**
     * Getter for the start Screen. Should be overwritten.
     * @return
     */
    public Screen getStartScreen();

}
