package framework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * Interface to deal with reading and writing to classes
 * @author vasyl
 *
 */
public interface FileIO {
	
	public InputStream readAsset(String filename) throws IOException;
	
	public InputStream readFile(String fileName) throws IOException;
	
	public OutputStream writeFile(String fileName) throws IOException;

}
