package impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Environment;
import android.preference.PreferenceManager;
import framework.FileIO;
/**
 * Implementation of the FileIO interface. It stores Context - a gateway to Android from
 * which it gets AssetManager to be able to operate with assets(files, sounds, music, pics)
 * @author vasyl
 *
 */
public class AndroidFileIO implements FileIO {
	Context context; // application environment
	AssetManager assets; // access to files
	String internalStoragePath;
	/**
	 * Constructor for AndroidFileIO
	 * @param context application environment
	 */
	public AndroidFileIO(Context context) {
		this.context = context;
		this.assets = context.getAssets();
		// path to the storage directoty
		this.internalStoragePath = Environment.getDataDirectory().getAbsolutePath() +File.separator;
	}

	@Override
	public InputStream readAsset(String fileName) throws IOException {
		// TODO Auto-generated method stub
		return assets.open(fileName);
	}

	@Override
	public InputStream readFile(String fileName) throws IOException {
		// TODO Auto-generated method stub
		return new FileInputStream(internalStoragePath + fileName);
	}

	@Override
	public OutputStream writeFile(String fileName) throws IOException {
		// TODO Auto-generated method stub
		return new FileOutputStream(internalStoragePath + fileName);
	}
	public SharedPreferences getPreferences() {
		return PreferenceManager.getDefaultSharedPreferences(context);
	}

}
