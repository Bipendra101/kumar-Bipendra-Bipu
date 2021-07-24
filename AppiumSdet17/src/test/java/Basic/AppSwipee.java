package Basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppSwipee {
	public static void main(String[] args) throws MalformedURLException {



		DesiredCapabilities dc = new DesiredCapabilities();
		// Common DC (Android or IOS)
		dc.setCapability("deviceName", "Redmi Note 8 Pro");  
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10.0");
		dc.setCapability("UDID", "bqq8kfnbwov8onk7");
		//DC for Android 
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreen");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");

		//appium server port number
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver= new AndroidDriver(url, dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//vertical swipe
		//driver.swipe(459, 367, 459, 1063, 500);
		//horizantal swipe
		//driver.swipe(40, 1060, 900, 1060, 500);
		//inclined swipe
		//driver.swipe(119, 1506,390, 892, 500);
		

		  Dimension size = driver.manage().window().getSize();
		  
		  int ht = size.getHeight();
		  
		  int wd = size.getWidth();
		  
		  System.out.println("Height or length of phone is-"+ht);
		  
		  //vertical Swipe
		  driver.swipe(wd/2,(int)(ht*0.25), wd/2,(int)(ht*0.80),1000);
		  
		  //Horizontal Swipe
		  driver.swipe((int)(wd*0.20), ht/2,(int)(wd*.80), ht/2,1000);
	}
}