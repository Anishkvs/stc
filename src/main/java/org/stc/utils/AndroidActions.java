package org.stc.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
//import io.appium.java_client.MobileBy;
import javax.lang.model.util.Elements.Origin;
import javax.tools.JavaFileObject.Kind;

import io.appium.java_client.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.collect.ImmutableMap;

import groovy.xml.streamingmarkupsupport.Builder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AndroidActions {

	AndroidDriver driver;

	public AndroidActions(AndroidDriver driver) {
		this.driver = driver;
	}

	public void longPress(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 3000));

	}

	public void scrollText(String text) {
//Scroll down Java: 8.6.0
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+text+"\"));"));
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().text(\""+text+"\"))"));
	}

	public void waitForElementToAppear(WebElement ele, AppiumDriver driver)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains((ele),"text" , "Cart"));
	}
	public void waitForElementToAppearWithText(WebElement ele, AppiumDriver driver, String expectedText) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	    wait.until(ExpectedConditions.attributeContains(ele, "text", expectedText));
	}

	public void scrollToActions() {
		boolean canScrollMore;
		do
		{
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 75.0
		));
		}while(canScrollMore);
	}
	
	public void scrollChat() {
		String text = "your_text_to_scroll_to";
		String uiSelector = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + text + "\"))";
		//driver.findElement(MobileBy.AndroidUIAutomator(uiSelector));
	}
	
//	public void swipeUp() {
//		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//		 "elementId", ((RemoteWebElement)firstMonth).getId(),
//				//   "left", 100, "top", 100, "width", 200, "height", 200,
//		    "direction", "up",
//		    "percent", 0.75
//		));
//	}
	
	public static void swipeFromBottomToTop(WebDriver driver) throws Exception {

		
	}
	
	public void scrollNew() {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Smartphones\"));"));

	}
	
	public void swipeDown() {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 1
			));
	}
	public void swipeActionNew(String directions)
	{
		Dimension screenSize = driver.manage().window().getSize();
		int height = screenSize.getHeight();
		int width = screenSize.getWidth();
		boolean scroll;
		do {
		   scroll = (boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		         "left", 0, "top", 100, "width", width, "height", height / 2,
		         "direction", directions,
		         "percent", 0.75
		   ));
		} while (scroll);
	}
	
	public String getScreenshotPathAndroid(String testCaseName, AppiumDriver driver) throws IOException
	{
		File source = driver.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"//reports"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
		//1. capture and place in folder //2. extent report pick file and attach to report
				
	}
	
	public void swipeActionNewChat(String directions, By locator) {
	    Dimension screenSize = driver.manage().window().getSize();
	    int height = screenSize.getHeight();
	    int width = screenSize.getWidth();
	    boolean scroll = true;

	    do {
	        // Perform scroll
	        ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
	                "left", 0, "top", 100, "width", width, "height", height / 2,
	                "direction", directions,
	                "percent", 0.75
	        ));

	        // Check if the WebElement is displayed or present
	        WebElement ele = driver.findElement(locator);
	        if (ele.isDisplayed()) {
	            scroll = false; // Stop scrolling if the element is displayed
	        }
	        // Alternatively, you can use ele.isPresent() if isDisplayed() doesn't work for your scenario

	    } while (scroll);
	}
	
	public void scrollActionTwo(String directions) {
		Dimension screenSize = driver.manage().window().getSize();
		int height = screenSize.getHeight();
		int width = screenSize.getWidth();

		// Perform scroll
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		        "left", 0, "top", 100, "width", width, "height", height / 2,
		        "direction", directions,
		        "percent", 1
		));

	}
	
}
