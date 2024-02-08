package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GetNewLineFirstPage extends AndroidActions {

	AndroidDriver driver;

	public GetNewLineFirstPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Prepaid\"])[1]")
	private WebElement MobilePrePaid;

	public void setMobilePrePaid() throws InterruptedException {
		MobilePrePaid.click();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Postpaid\"])[1]")
	private WebElement MobilePostpaid;

	public void setMobilePostpaid() throws InterruptedException {
		MobilePostpaid.click();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Prepaid\"])[2]")
	private WebElement InternetPrePaid;

	public void setInternetPrePaid() throws InterruptedException {
		InternetPrePaid.click();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Postpaid\"])[2]")
	private WebElement InternetPostpaid;

	public void setInternetPostpaid() throws InterruptedException {
		InternetPostpaid.click();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"VACANT\"])[1]")
	private WebElement Vacant;

	public void setVacant() throws InterruptedException {
		Vacant.click();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Add\"])[1]")
	private WebElement AddDevice;

	public void setAddDevice() throws InterruptedException {
		AddDevice.click();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Add\"])[2]")
	private WebElement AddAccessories;

	public void setAddAccessories() throws InterruptedException {
		AddAccessories.click();
	}
}
