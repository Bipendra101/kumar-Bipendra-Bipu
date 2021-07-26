package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwitchApp {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "Redmi Note 8 Pro");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "10.0");
		  dc.setCapability("UDID", "bqq8kfnbwov8onk7");
		  //DC for Android 
		  dc.setCapability("appPackage", "io.appium.android.apis");
		  dc.setCapability("appActivity", ".ApiDemos");
		  
		  // Appium Server Port No. 
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		AndroidDriver driver= new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  WebElement views=  driver.findElementByAccessibilityId("Views");
		  views.click();
		  
		  driver.startActivity("com.androidsample.generalstore", ".SplashActivity");

			Thread.sleep(2000);
			driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();


			//driver.startActivity("io.appium.android.apis", "ApiDemos");

			//		driver.launchApp();



			
	}

}
