package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PasswordPage extends AndroidActions {

	AndroidDriver driver;

	public PasswordPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement passwordBox;

	public void enterPassword(String number) {
		passwordBox.sendKeys(number);
	}
	
	@AndroidFindBy(accessibility = "Sign in")
	private WebElement signIn;

	public void setSignIn() {
		signIn.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Login via SMS\"]")
	private WebElement loginSMS;

	public void setLoginSMS() {
		loginSMS.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Send Code\"]")
	private WebElement SendCode;

	public void setSendCode() {
		SendCode.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement OTPOne;

	public void setOTPOne(String FirstOtp) {
		OTPOne.sendKeys(FirstOtp);
	}
}
