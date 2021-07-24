package Basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Appinstall1 {
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Redmi Note 8 Pro");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "10.0");
		  dc.setCapability("UDID", "bqq8kfnbwov8onk7");
		  //DC for Android 
		 // dc.setCapability("appPackage", "io.appium.android.apis");
		 // dc.setCapability("appActivity", ".ApiDemos");
		  
		  
		  // to install app
		  dc.setCapability("App", "E:\\ApiDemos-debug");
          URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver= new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		 System.out.println("App Status="+driver.isAppInstalled("io.appium.android.apis"));//true
	}

}
