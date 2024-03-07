package org.stc.pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddCardPage extends AndroidActions {

	AndroidDriver driver;

	public AddCardPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"XXXX XXXX XXXX XXXX\"]")
	private WebElement CardNumber;

	public void setCardNumber(String cardNumber) throws InterruptedException {
		CardNumber.sendKeys(cardNumber);
	}

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Card Holder\"]")
	private WebElement CardHolderName;

	public void setCardHolderName(String cardName) throws InterruptedException {
		CardHolderName.sendKeys(cardName);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"XX/XX\"]")
	private WebElement ExpireDate;

	public void setExpireDate() throws InterruptedException {
		ExpireDate.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"XXX\"]")
	private WebElement CVV;

	public void setCVV() throws InterruptedException {
		CVV.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"By paying you agreed to our Terms and Conditions\"]")
	private WebElement TermsAndConditions;

	public void setTermsAndConditions() throws InterruptedException {
		TermsAndConditions.click();
	}
	
	@AndroidFindBy(accessibility = "Proceed")
	private WebElement Proceed;

	public void setProceed() throws InterruptedException {
		Proceed.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
	private WebElement closeButton;

	public void setcloseButton() throws InterruptedException {
		closeButton.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@index=\"05\"]")
	private WebElement month;
	

	public void setMonth() throws InterruptedException {
		scrollText("03");
		//month.click();

	}
	public void swipeUpMonth() {
		WebElement firstMonth =driver.findElement(By.xpath("//android.widget.TextView[@text=\"01\"]"));
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		 "elementId", ((RemoteWebElement)firstMonth).getId(),
				//   "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "left",
		    "percent", 0.75
		));
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"2028\"]")
	private WebElement year;

	public void setYear() throws InterruptedException {
		
		scrollText("2027");
		//year.click();
		//swipeUp();
		//year.click();
	}
	
	/////
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"01\"]")
	private WebElement expiryMonthZero;

	public void setexpiryMonthZero() throws InterruptedException {
		expiryMonthZero.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView[2]/android.view.ViewGroup")
	private WebElement expiryYearZero;

	public void setexpiryYearZero() throws InterruptedException {
		expiryYearZero.click();
	}
}
