package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NumberPage extends AndroidActions {

	AndroidDriver driver;

	public NumberPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/////	
	@AndroidFindBy(accessibility = "Mobile Number-input")
	private WebElement numberBox;

	public void enterNumber(String number) throws InterruptedException {
		Thread.sleep(2000);	
		numberBox.sendKeys(number);
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Amount\"]")
	private WebElement RechargeNumberBox;

	public void enterRechargeNumber(String number) throws InterruptedException {
		Thread.sleep(2000);	
		RechargeNumberBox.sendKeys(number);
	}
	@AndroidFindBy(accessibility = "Civil ID Number-input")
	private WebElement CivilIdNumberBox;

	public void enterCivilIdNumber(String number) throws InterruptedException {
		CivilIdNumberBox.sendKeys(number);
	}
	@AndroidFindBy(accessibility = "ENTER YOUR NUMBER-input")
	private WebElement guestNumberBox;

	public void guestEnterNumber(String number) throws InterruptedException {
		Thread.sleep(2000);	
		guestNumberBox.sendKeys(number);
	}
	@AndroidFindBy(accessibility = "Number-input")
	private WebElement guestNumberBoxTwo;

	public void guestNumberBoxTwo(String number) throws InterruptedException {
		Thread.sleep(2000);	
		guestNumberBoxTwo.sendKeys(number);
	}
/////
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement backNumber;

	public void backButtonOnNumber() {
		backNumber.click();
	}

/////	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView[2]")
	private WebElement ContactNumber;

	public void getContactNumber() {
		ContactNumber.click();
	}

/////	
	@AndroidFindBy(accessibility = "Continue")
	private WebElement Continue;

	public void setContinue() throws InterruptedException {
		Continue.click();
	}

	@AndroidFindBy(accessibility = "Confirm")
	private WebElement Confirm;

	public void setConfirm() throws InterruptedException {
		Confirm.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Forgot your Password?\"]")
	private WebElement ForgotPass;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Enter Your Mobile Number\"]")
	private WebElement ForgotEnterMobileNum;

	public void setForgotPass() throws InterruptedException {
		ForgotPass.click();
		Thread.sleep(2000);
		Boolean EnterMobileNum = ForgotEnterMobileNum.isDisplayed();
		System.out.println("Enter Mobile Number page is displayed: " + EnterMobileNum);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Login using Civil ID\"]")
	private WebElement LoginViaCivilId;

	public void setLoginViaCivilId() throws InterruptedException {
		LoginViaCivilId.click();
		Thread.sleep(2000);
		
	}
}
