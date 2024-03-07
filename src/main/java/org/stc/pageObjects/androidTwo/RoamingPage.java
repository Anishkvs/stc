package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RoamingPage extends AndroidActions {

	AndroidDriver driver;

	public RoamingPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Login to Subscribe")
	private WebElement RoamingDestinationsSubscribe;
	@AndroidFindBy(accessibility = "Postpaid")
	private WebElement RoamingDestinationsPostpaid;
	@AndroidFindBy(accessibility = "Prepaid")
	private WebElement RoamingDestinationsPrepaid;

	public void viewRoamingDestinationsSubscribe() {
	//	Boolean sub =RoamingDestinationsSubscribe.isDisplayed();
		Boolean postpaid =RoamingDestinationsPostpaid.isDisplayed();
	//	Boolean prepaid = RoamingDestinationsPrepaid.isDisplayed();
		System.out.println("Roaming Destinations Subscribe is displayed: " +" "+postpaid+" ");
	}

	@AndroidFindBy(accessibility = "UAE")
	private WebElement UAE;

	public void setUAE() {
		UAE.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'KD')]")
	private WebElement RoamingKD;

	public void setRoamingKD() {
		RoamingKD.click();
	}
	
	@AndroidFindBy(accessibility = "Subscribe")
	private WebElement RoamingSubscribe;

	public void setRoamingSubscribe() {
		RoamingSubscribe.click();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Cancel\"]")
	private WebElement RoamingCancel;

	public void setRoamingCancel() {
		RoamingCancel.click();
	}
}
