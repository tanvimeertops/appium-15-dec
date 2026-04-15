package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DragnDrop extends BaseClass {

	@Test
	public void DND() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		drag_n_drop(ele);
	}
	
	String res=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
	
//	Assert.assertEquals(res, "Dropped!");
}
