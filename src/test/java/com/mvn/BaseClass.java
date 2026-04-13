package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
}
