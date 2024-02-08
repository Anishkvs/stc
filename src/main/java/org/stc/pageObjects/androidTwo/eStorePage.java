package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class eStorePage extends AndroidActions {

	AndroidDriver driver;

	public eStorePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Switch to stc")
	private WebElement SwitchToStc;

	public void setSwitchToStc() {
		SwitchToStc.click();
	}

	@AndroidFindBy(accessibility = "Mobile and Internet")
	private WebElement MobileAndInternet;

	public void setMobileAndInternet() {
		MobileAndInternet.click();
	}
}
