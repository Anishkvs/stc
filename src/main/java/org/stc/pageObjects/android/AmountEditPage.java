package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AmountEditPage extends AndroidActions {

	AndroidDriver driver;

	public AmountEditPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Edit\"]")
	private WebElement editAmount;
	
	public void setAmount() throws InterruptedException {
		Thread.sleep(2000);
		editAmount.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Amount to Be Paid\"]")
	private WebElement AmountPaidTitile;
	@AndroidFindBy(accessibility= "Continue")
	private WebElement continueButton;
	
	public void setContinueButton() throws InterruptedException {
		continueButton.click();
	//	waitForElementToAppearWithText(AmountPaidTitile, driver, "Amount to Be Paid");
	}
	
	@AndroidFindBy(xpath= "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement close;
	
	public void setClose() {
		close.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Add Another Number\"]")
	private WebElement addNumber;
	
	public void setAddNumber() throws InterruptedException {
//		waitForElementToAppearWithText(AmountPaidTitile, driver, null);
		Thread.sleep(5000);
		addNumber.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"51602474 | Postpaid\"]")
	private WebElement postPaidNum1;
	
	public void viewPostPaidNum1() {
		Boolean num1 =postPaidNum1.isDisplayed();
		System.out.println("51602474 is displayed: "+num1);
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"51601159 | Postpaid\"]")
	private WebElement postPaidNum2;
	
	public void viewPostPaidNum2() {
		Boolean num2 =postPaidNum2.isDisplayed();
		System.out.println("51601159 is displayed: "+num2);

	}
	@AndroidFindBy(xpath= "(//android.widget.TextView[@text=\"Edit\"])[1]")
	private WebElement editFirst;
	
	public void setEditFirst() {
		editFirst.click();
	}
	@AndroidFindBy(xpath= "(//android.widget.TextView[@text=\"Edit\"])[2]")
	private WebElement editSecond;
	
	public void setEditSecond() {
		editSecond.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.EditText[@index='4']")
	private WebElement editInAppAccount;
	
	public void setEditInApp(String value) throws InterruptedException {
		editInAppAccount.clear();
		Thread.sleep(1000);
		editInAppAccount.sendKeys(value);
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Custom\"]")
	private WebElement Custom;
	
	public void setCustom() {
		Custom.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.EditText[@text=\"0\"]")
	private WebElement EditAmount;
	
	public void setEditAmount(String num) {
		EditAmount.sendKeys(num);
	}
	
	@AndroidFindBy(xpath= "android.widget.EditText")
	private WebElement EditAmountOne;
	
	public void setEditAmountOne() {
		EditAmountOne.clear();
	}
	@AndroidFindBy(accessibility= "Proceed")
	private WebElement Proceed;
	
	public void setProceed() throws InterruptedException {
		Proceed.click();
		Thread.sleep(2000);
		}
}
