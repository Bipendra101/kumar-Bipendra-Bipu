package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ToastMsg {

	public static void main(String[] args) throws MalformedURLException {
		
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
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		String toastmsg=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		
		System.out.println(toastmsg);

	}

	
}
