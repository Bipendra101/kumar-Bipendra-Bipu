package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

public void readDataTest() throws IOException {
		
		//Read the data from properties files
		//Step:1:get the java representation of physical file
		//we have to create object of file input stream
		
		FileInputStream FileInputStream = new FileInputStream("./data\\commondata.properties");
		
		//Step:2 create an object of properties class & load  all the key value pair
		Properties P1 = new Properties();
		P1.load(FileInputStream);
		
		// STEP 3: read the value using getProperty("key")
		String URL=P1.getProperty("Url");
		System.out.println(URL);
	} 

} 

