package org.stc.pageObjects.android;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import org.stc.utils.AppiumUtils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PaymentPage extends AndroidActions {

	AndroidDriver driver;
	AppiumUtils ob;
	public PaymentPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility= "Pay KD 2")
	private WebElement payKD;
	
	public void setPayKDAmount() throws InterruptedException {
		Thread.sleep(2000);
		payKD.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement paymentBack;
	
	public void setPaymentBack() {
		paymentBack.click();
		}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Use Another Card\"]")
	private WebElement useAnotherCard;
	
	public void setAnotherCard() {
		useAnotherCard.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"By paying you agreed to our Terms and Conditions\"]")
	private WebElement useTermsAndConditions;
	
	public void setTermsAndConditions() {
		useTermsAndConditions.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement paymentFrameBox;

	public void setPaymentFrameBox() throws InterruptedException  {
		Thread.sleep(10000);
		paymentFrameBox.click();
	//	ob.getScreenshotPath(null, driver);
	}
	
}
