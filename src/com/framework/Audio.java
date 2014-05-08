/**
 * 
 */
package com.framework;

/**
 * @author vasyl
 * Creates new Music and Sound instances
 *
 */
public interface Audio {
	
	public Music newMusic(String filename);
	
	public Sound newSound(String filename);

}
