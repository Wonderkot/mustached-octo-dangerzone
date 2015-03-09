/**
 * 
 */
package propRead;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

/**
 * @author Wonderkot
 *
 */
public class PropReadTest {	

	@Test
	public void test() throws IOException {
		InputStream inputStream =  getClass().getClassLoader().getResourceAsStream("config.properties");
		PropReader propReader = new PropReader(inputStream);
		Properties properties = propReader.getAllProps();
		String res =  properties.getProperty("user");
		System.out.println(res);		
	}

}
