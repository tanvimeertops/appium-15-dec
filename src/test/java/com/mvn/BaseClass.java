package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
	AndroidDriver driver;
	@BeforeTest
	public void test() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Tanvi");
		options.setApp("D:\\Selenium\\apk file\\ApiDemos-debug.apk");
//		options.setApp("H:\\apk file\\General-Store.apk");
		 driver=new AndroidDriver
				(new URL("http://127.0.0.1:4723/"),options);
		 //implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(3000);
		}

		public void drag_n_drop(WebElement source) {
			((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
					ImmutableMap.of("elementId", ((RemoteWebElement) source).getId(), "endX", 619, "endY", 560));

		}
		public void longPressAction(WebElement ele)
		{
			((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
					ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
							"duration",2000));
		}

		
		public void tearDown() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}
}
