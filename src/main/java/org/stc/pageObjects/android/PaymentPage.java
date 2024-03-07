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
	
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Pay KD')]")
	private WebElement payKD;

	public void setPayKDAmount() throws InterruptedException {
		//Thread.sleep(2000);
		payKD.click();
	}
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Pay')]")
	private WebElement pay;

	public void setPayAmount() throws InterruptedException {
		//Thread.sleep(2000);
		pay.click();
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
	
	@AndroidFindBy(accessibility = "Place Order")
	private WebElement PlaceOrder;

	public void setPlaceOrder() throws InterruptedException  {
		PlaceOrder.click();
	}
	
	@AndroidFindBy(accessibility = "K Net")
	private WebElement KNet;

	public void setKNet() throws InterruptedException  {
		KNet.click();
	}
	
	@AndroidFindBy(accessibility = "Payment on delivery")
	private WebElement PayDelivery;

	public void setPayDelivery() throws InterruptedException  {
		PayDelivery.click();
	}
	
	@AndroidFindBy(accessibility = "Payments Methods, CARDS AND RECURRING PAYMENTS")
	private WebElement CardAndRecurringPay;

	public void setCardAndRecurringPay() throws InterruptedException  {
		CardAndRecurringPay.click();
		Thread.sleep(4000);
		driver.navigate().back();
		CardAndRecurringPay.click();
		Thread.sleep(8000);
		driver.navigate().back();
		/*
		CardAndRecurringPay.click();
		Thread.sleep(1000);
		waitForElementToAppearWithText(AddCard, driver, "Add");
		*/
	}
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"XXXX XXXX XXXX XXXX\"]")
	private WebElement CardNumber;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add Card\"]")
	private WebElement AddCardPage;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Use Another Card\"] | //android.widget.TextView[@text=\"Add Card\"]")
	private WebElement AddCard;

	public void setAddCard() throws InterruptedException  {
		AddCard.click();
		Thread.sleep(2000);
		waitForElementToAppearWithText(AddCardPage, driver, "Add Card");
		//CardNumber.sendKeys("5555");
		driver.navigate().back();	
	}
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Autopay\"]")
	private WebElement AutoPayOption;
	
	@AndroidFindBy(accessibility= "AutoPay, MANAGE YOUR AUTOPAY")
	private WebElement AutoPay;
	
	public void setAutoPay() throws InterruptedException {
		AutoPay.click();
		Thread.sleep(2000);
		driver.navigate().back();
		AutoPay.click();
		Thread.sleep(8000);
		driver.navigate().back();
		driver.navigate().back();
		/*
		AutoPay.click();
		waitForElementToAppearWithText(AutoPayOption, driver, "Autopay");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		*/
	}
	
	
}
