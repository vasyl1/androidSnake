/**
 * 
 */
package framework.impl;

import android.graphics.Bitmap;
import framework.Graphics.PixmapFormat;
import framework.Pixmap;

/**
 * @author vasyl
 *
 */
public class AndroidPixmap implements Pixmap {
	Bitmap bitmap;
	PixmapFormat format;
	
	public AndroidPixmap(Bitmap bitmap, PixmapFormat format) {
		this.bitmap = bitmap;
		this.format = format;
	}

	/* (non-Javadoc)
	 * @see framework.Pixmap#getWidth()
	 */
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return bitmap.getWidth();
	}

	/* (non-Javadoc)
	 * @see framework.Pixmap#getHeight()
	 */
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return bitmap.getHeight();
	}

	/* (non-Javadoc)
	 * @see framework.Pixmap#getFormat()
	 */
	@Override
	public PixmapFormat getFormat() {
		// TODO Auto-generated method stub
		return format;
	}

	/* (non-Javadoc)
	 * @see framework.Pixmap#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		bitmap.recycle();

	}

}
