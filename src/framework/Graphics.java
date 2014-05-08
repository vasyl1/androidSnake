/**
 * 
 */
package framework;

/**
 * Interface containing methods for dealing with Graphics
 * @author vasyl
 *
 */
public interface Graphics {
	
	
	 // encoding for different pixel formats
	 public static enum PixmapFormat {
	        ARGB8888, ARGB4444, RGB565
	    }

	 	/**
	 	 * Loads an image from a file and transforms it into a Pixmap
	 	 * @param fileName
	 	 * @param format
	 	 * @return
	 	 */
	    public Pixmap newPixmap(String fileName, PixmapFormat format);
	    
	    /**
	     * clears framebuffer with the given color
	     * @param color
	     */
	    public void clear(int color);
	    /**
	     * Sets the pixel with the given color
	     * @param x
	     * @param y
	     * @param color
	     */
	    public void drawPixel(int x, int y, int color);
	    /**
	     * Draws a line between two given pixels with the given color
	     * @param x
	     * @param y
	     * @param x2
	     * @param y2
	     * @param color
	     */
	    public void drawLine(int x, int y, int x2, int y2, int color);
	    
	    /**
	     * Draws a rectangle that starts at top-left  at the given pixel and extends to
	     * the specified height and width. Fills it up with given color
	     * @param x
	     * @param y
	     * @param width
	     * @param height
	     * @param color
	     */
	    public void drawRect(int x, int y, int width, int height, int color);

	    /**
	     * Draws rectangle for the Pixmap at the specified coordinate which is 
	     * the top-left corner. 
	     * @param pixmap
	     * @param x
	     * @param y
	     * @param srcX - pixmaps own coordinate system
	     * @param srcY - pixmaps own coordinate system
	     * @param srcWidth
	     * @param srcHeight
	     */
	    public void drawPixmap(Pixmap pixmap, int x, int y, int srcX, int srcY,
	            int srcWidth, int srcHeight);

	    /**
	     * Draws rectangle for the Pixmap at the specified coordinate which is 
	     * the top-left corner. 
	     * @param pixmap
	     * @param x
	     * @param y
	     * @param srcWidth
	     * @param srcHeight
	     */
	    public void drawPixmap(Pixmap pixmap, int x, int y);
	    /**
	     * returns width of framebuffer in pixels
	     * @return
	     */
	    public int getWidth();
	    /**
	     * returns height of framebuffer in pixels
	     * @return
	     */
	    public int getHeight();

}
