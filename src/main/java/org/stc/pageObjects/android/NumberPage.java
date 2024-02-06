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
	@AndroidFindBy(xpath= "//android.widget.EditText")
	private WebElement numberBox;
	
	public void enterNumber(String number) {
		numberBox.sendKeys(number);
	}
/////
	@AndroidFindBy(xpath= "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement backNumber;
	
	public void backButtonOnNumber() {
		backNumber.click();
	}
/////	
	@AndroidFindBy(xpath= "//android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView[2]")
	private WebElement ContactNumber;
	
	public void getContactNumber() {
		ContactNumber.click();
	}
/////	
	@AndroidFindBy(accessibility= "Continue")
	private WebElement Continue;
	
	public void getContinue() throws InterruptedException {
		Continue.click();
		Thread.sleep(5000);

	}

}
