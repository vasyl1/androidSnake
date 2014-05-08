/**
 * 
 */
package com.framework;

import com.framework.Graphics.PixmapFormat;

/**
 * Interface for pixel mapping 
 * @author vasyl
 *
 */
public interface Pixmap {
	/**
	 * width of pixmap in pixels
	 * @return
	 */
	public int getWidth();
	/**
	 * height of pixmap in pixels
	 * @return
	 */
    public int getHeight();
    /**
     * format encoding in which Pixmap is stored
     * @return
     */
    public PixmapFormat getFormat();
    /**
     * Frees resources used by Pixmap
     */
    public void dispose();

}
