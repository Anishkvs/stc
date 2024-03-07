package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PasswordPage extends AndroidActions {

	AndroidDriver driver;
	AndroidActions action = new AndroidActions(driver);

	public PasswordPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//@AndroidFindBy(id = "Password-input")
	@AndroidFindBy(accessibility = "Password-input")
	private WebElement passwordBox;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Enter your password\"]")
	private WebElement EnterYourPass;
	public void enterPassword(String number) throws InterruptedException {
		waitForElementToAppearWithText(EnterYourPass, driver, "Enter your password");
		passwordBox.sendKeys(number);
	}

	@AndroidFindBy(accessibility = "Sign in")
	private WebElement signIn;

	public void setSignIn() throws InterruptedException {
		//Thread.sleep(5000);
		signIn.click();
	}

	@AndroidFindBy(accessibility = "Login via SMS")
	private WebElement loginSMS;

	public void setLoginSMS() {
		loginSMS.click();
	}

	@AndroidFindBy(accessibility = "Send Code")
	private WebElement SendCode;

	public void setSendCode() {
		SendCode.click();
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement OTPOne;

	public void setOTPOne(String FirstOtp) {
		OTPOne.sendKeys(FirstOtp);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Enter the 4-digit code\"]")
	private WebElement EnterFourDigitText;

	public void setEnterFourDigitText() {
		//waitForElementToAppearWithText(EnterFourDigitText, driver, "Enter the 4-digit code");
		Boolean OTPTitle = EnterFourDigitText.isDisplayed();
		System.out.println("Enter Four Digit Text is displayed: "+ OTPTitle);
	}
	
	@AndroidFindBy(accessibility = "Forgot your Password?")
	private WebElement ForgotYourPassword;

	public void setForgotYourPassword() {
		ForgotYourPassword.click();
	}

}
