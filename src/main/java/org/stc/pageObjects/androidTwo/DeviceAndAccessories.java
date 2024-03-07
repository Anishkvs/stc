package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DeviceAndAccessories extends AndroidActions {

	AndroidDriver driver;

	public DeviceAndAccessories(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'APPLE')]")
	private WebElement AppleDevice;

	public void setAppleDevice() throws InterruptedException {
		scrollText("APPLE");
		AppleDevice.click();
	}

	@AndroidFindBy(accessibility = "Add As Primary Device")
	private WebElement AddPrimaryDevice;

	public void setAddPrimaryDevice() throws InterruptedException {
		AddPrimaryDevice.click();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Request Call Back\"] | //android.widget.TextView[@text=\"Continue\"]")
	private WebElement ContinueOrCallBack;

	public void setContinueOrCallBack() throws InterruptedException {
		ContinueOrCallBack.click();
		Thread.sleep(6000);
	}
}
