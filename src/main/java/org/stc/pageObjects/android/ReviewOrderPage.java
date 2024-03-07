package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ReviewOrderPage extends AndroidActions {

	AndroidDriver driver;

	public ReviewOrderPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Continue")
	private WebElement Continue;

	public void setContinue() throws InterruptedException {
		Continue.click();
	}
	
	@AndroidFindBy(accessibility = "I am an stc customer")
	private WebElement IAmAnSTCCustomer;

	public void setIAmAnSTCCustomer() throws InterruptedException {
		IAmAnSTCCustomer.click();
		Continue.click();
	}
	
	@AndroidFindBy(accessibility = "Close")
	private WebElement Close;
	@AndroidFindBy(accessibility = "Submit")
	private WebElement Submit;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue\"] | //android.widget.TextView[@text=\"Pre Order Now\"]")
	private WebElement ContinueOrPreOder;
	
		public void setCompleteOrder() {
			ContinueOrPreOder.click();
			Submit.click();
			Close.click();
		}
		
		@AndroidFindBy(accessibility = "Rate your experience")
		private WebElement RateYourExperience;
		@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
		private WebElement Comment;
		@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]")
		private WebElement Emoji;
		@AndroidFindBy(accessibility = "Name-input")
		private WebElement Name;
		@AndroidFindBy(accessibility = "Enter your contact number-input")
		private WebElement Number;
		public void setRateYourExperience(){
			Name.sendKeys("Test");
			Number.sendKeys("51307734");
			Emoji.click();
			Comment.sendKeys("AutomationTest");
			RateYourExperience.click();
		}
		
		public void swipeDownThree(){
			scrollActionTwo("down");
			scrollActionTwo("down");
			scrollActionTwo("down");
			scrollActionTwo("down");
		}
}
