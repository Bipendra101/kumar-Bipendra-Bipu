package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AndroidAction {
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Redmi Note 8 Pro");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "10.0");
		  dc.setCapability("UDID", "bqq8kfnbwov8onk7");
		  //DC for Android 
		  dc.setCapability("appPackage", "com.android.camera");
		  dc.setCapability("appActivity", ".Camera");
		  
		  // Appium Server Port No. 
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		AndroidDriver driver= new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//			System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
		//			
		//			System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		//			
		//			System.out.println(AndroidKeyCode.BACK);
		//			
		//			System.out.println(AndroidKeyCode.ENTER);
		//			
		//			System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		//			
		//			System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);

		//driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);

		//		driver.pressKeyCode(AndroidKeyCode.BACK);
		//	
		//		Thread.sleep(2000);
		//
		//		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		//
		//		Thread.sleep(2000);
		//
		//		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		//
		//		Thread.sleep(2000);
		//
		//		driver.openNotifications();
		//		
		//		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		//		
		//		Thread.sleep(2000);
		//
		//		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);

	}

	}


