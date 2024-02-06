package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class E_StorePage extends AndroidActions {

	AndroidDriver driver;

	public E_StorePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Switch to stc")
	private WebElement SwitchToStc;

	public void setSwitchToStc() throws InterruptedException {
		SwitchToStc.click();
	}
	@AndroidFindBy(accessibility = "Mobile and Internet")
	private WebElement MobileAndInternet;

	public void setMobileAndInternet() throws InterruptedException {
		MobileAndInternet.click();
	}
	
	
}
