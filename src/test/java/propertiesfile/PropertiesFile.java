package propertiesfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static String projectPath = System.getProperty("user.dir");
	// Create object of class Properties
	static Properties prop = new Properties();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
	}

	public static void getProperties() {

		try {

			// Create object of class InputStream
			InputStream input = new FileInputStream(projectPath + "/src/test/java/propertiesfile/config.properties");

			// Load Property File
			prop.load(input);

			// Get Property value
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
			TestNG_Demo_With_Properties.browserName = browser;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void setProperties() {

		try {
			// Create object of class OutputStream
			OutputStream output = new FileOutputStream(projectPath + "/src/test/java/propertiesfile/config.properties");

			// Set Property value
			prop.setProperty("browser", "chrome");
			
			//Store property value
			prop.store(output, null);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
