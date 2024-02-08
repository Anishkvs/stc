package org.stc.utils;

import java.time.Duration;
import java.util.Arrays;

import javax.lang.model.util.Elements.Origin;
import javax.tools.JavaFileObject.Kind;

import io.appium.java_client.*;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
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
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+text+"\"));"));

	}

	public void waitForElementToAppear(WebElement ele, String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.attributeContains((ele), "text", text));

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
}
