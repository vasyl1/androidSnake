/**
 * 
 */
package com.framework;

/**
 * Interface for playing and disposing Sounds in Android apps
 * @author vasyl
 *
 */
public interface Sound {
	/**
	 *  Plays a sound with the specified volume
	 * @param volume
	 */
	public void play(float volume);
	/**
	 * frees resources not needed after Sound instance is terminated
	 */
    public void dispose();
}
