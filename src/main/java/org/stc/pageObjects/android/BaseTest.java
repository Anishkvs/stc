package org.stc.pageObjects.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.stc.utils.AndroidActions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
//adb devices
//adb shell dumpsys window | find "mCurrentFocus"

public class BaseTest {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	AndroidActions actions;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException, InterruptedException {
/*
		service = new AppiumServiceBuilder()
				.withAppiumJS(new File(
						"C://Users//Anishkumar//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
*/
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("AnishEmulator");
		options.setAppPackage("com.pixilapps.selfcare");
		options.setAppActivity("com.mystc.MainActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.attributeContains(ele, null, null));
		
		//Thread.sleep(10000);
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();

		
	
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		 if (driver != null) {
	            driver.quit();
		 }
	}
}
