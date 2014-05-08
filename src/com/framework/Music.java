package com.framework;
/**
 * Music interface calls for methods normally associated with 
 * playing music
 * @author vasyl
 *
 */
public interface Music {
	public void play();
	
	public void stop();
	 
	public void pause();
	 
	/*
	 * loops through the song
	 */
	public void setLooping(boolean looping);
	
	/**
	 * volume 0 -mute , 1 - max
	 * @param volume
	 */
	public void setVolume(float volume);
	 
	public boolean isPlaying();
	 
	public boolean isStopped();
	 
	public boolean isLooping();
	/**
	 * closes Music related instances such as files, etc 
	 */
	public void dispose();
	
}
