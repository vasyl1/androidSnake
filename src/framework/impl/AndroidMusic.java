/**
 * 
 */
package framework.impl;

import java.io.IOException;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import framework.Music;

/**
 * @author vasyl
 *
 */
public class AndroidMusic implements Music, OnCompletionListener {
	MediaPlayer mediaPlayer;
	boolean isPrepared = false;
	
	
	 public AndroidMusic(AssetFileDescriptor assetDescriptor) {
		 mediaPlayer = new MediaPlayer();
	     try {
	    	 mediaPlayer.setDataSource(assetDescriptor.getFileDescriptor(),
	          assetDescriptor.getStartOffset(),
	          assetDescriptor.getLength());
	          mediaPlayer.prepare();
	          isPrepared = true;
	          mediaPlayer.setOnCompletionListener(this);
	        } catch (Exception e) {
	            throw new RuntimeException("Couldn't load music");
	        }
	 }

	/* (non-Javadoc)
	 * @see framework.Music#play()
	 */
	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (mediaPlayer.isPlaying())
            return;

        try {
            synchronized (this) {
                if (!isPrepared)
                    mediaPlayer.prepare();
                mediaPlayer.start();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

	/* (non-Javadoc)
	 * @see framework.Music#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		 mediaPlayer.stop();
	        synchronized (this) {
	            isPrepared = false;
	     }

	}

	/* (non-Javadoc)
	 * @see framework.Music#pause()
	 */
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if(mediaPlayer.isPlaying())
			mediaPlayer.pause();

	}

	/* (non-Javadoc)
	 * @see framework.Music#setLooping(boolean)
	 */
	@Override
	public void setLooping(boolean looping) {
		mediaPlayer.setLooping(looping);

	}

	/* (non-Javadoc)
	 * @see framework.Music#setVolume(float)
	 */
	@Override
	public void setVolume(float volume) {
		// TODO Auto-generated method stub
		mediaPlayer.setVolume(volume, volume);

	}

	/* (non-Javadoc)
	 * @see framework.Music#isPlaying()
	 */
	@Override
	public boolean isPlaying() {
		// TODO Auto-generated method stub
		return mediaPlayer.isPlaying();
	}

	/* (non-Javadoc)
	 * @see framework.Music#isStopped()
	 */
	@Override
	public boolean isStopped() {
		// TODO Auto-generated method stub
		return !isPrepared;
	}

	/* (non-Javadoc)
	 * @see framework.Music#isLooping()
	 */
	@Override
	public boolean isLooping() {
		// TODO Auto-generated method stub
		return mediaPlayer.isLooping();
	}

	/* (non-Javadoc)
	 * @see framework.Music#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		if (mediaPlayer.isPlaying())
			mediaPlayer.stop();
		mediaPlayer.release();

	}

	@Override
	public void onCompletion(MediaPlayer arg0) {
		// TODO Auto-generated method stub
		synchronized (this) {
			isPrepared = false;
		}
	}

}
