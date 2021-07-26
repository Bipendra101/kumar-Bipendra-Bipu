package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwitchMultipleWindow {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability("deviceName", "Redmi Note 8 Pro");  
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10.0");
		dc.setCapability("UDID", "bqq8kfnbwov8onk7");

		dc.setCapability("appPacakage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");

		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Sam");
	    
	    driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	    
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    
	    driver.findElementByXPath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']").click();
	    driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']\")).click();"));
	    
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	    Thread.sleep(4000);
	    
	    Set img = driver.getContextHandles();
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mathew");
	    

	}

}
