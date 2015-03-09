/**
 * 
 */
package propRead;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Wonderkot
 *
 */
public class PropReader {

	public PropReader(InputStream inputStream) {
		setInputStream(inputStream);
	}

	public Properties getAllProps() throws IOException {
		Properties properties = new Properties();
		if (inputStream != null) {
			properties.load(inputStream);
		} else {
			throw new FileNotFoundException(
					"property file  not found in the classpath");
		}
		return properties;
	}

	/**
	 * @return the inputStream
	 */
	public InputStream getInputStream() {
		return inputStream;
	}

	/**
	 * @param inputStream
	 *            the inputStream to set
	 */
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	private InputStream inputStream;

}
