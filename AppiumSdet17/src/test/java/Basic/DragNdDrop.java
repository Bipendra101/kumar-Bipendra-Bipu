package Basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragNdDrop {

	public static void main(String[] args) throws MalformedURLException {
	
		DesiredCapabilities dc = new DesiredCapabilities();
		// Common DC (Android or IOS)
		dc.setCapability("deviceName", "Redmi Note 8 Pro");  
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10.0");
		dc.setCapability("UDID", "bqq8kfnbwov8onk7");

		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");

		URL url=new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//How to find find Elements
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Drag and Drop").click();

		WebElement src=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement dest=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));

		TouchAction t=new TouchAction(driver);
		t.longPress(src).waitAction(2000).moveTo(dest).release().perform();


	}

}
