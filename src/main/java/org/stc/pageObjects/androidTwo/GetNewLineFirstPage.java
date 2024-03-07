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

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Select your base plan\"]")
	private WebElement MobilePrePaidTitle;
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Prepaid\"])[1]")
	private WebElement MobilePrePaid;

	public void setMobilePrePaid() throws InterruptedException {
		waitForElementToAppearWithText(GetaNewLineTitle, driver, "Get a New Line");
		MobilePrePaid.click();
		waitForElementToAppearWithText(MobilePrePaidTitle, driver, "Select your base plan");
	}
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Mobile - Postpaid\"])[2]")
	private WebElement MobilePostpaidTitle;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Get a New Line\"]")
	private WebElement GetaNewLineTitle;
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Postpaid\"])[1]")
	private WebElement MobilePostpaid;

	public void setMobilePostpaid() throws InterruptedException {
		waitForElementToAppearWithText(GetaNewLineTitle, driver, "Get a New Line");
		MobilePostpaid.click();
		waitForElementToAppearWithText(MobilePostpaidTitle, driver, "Mobile - Postpaid");
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Prepaid\"])[2]")
	private WebElement InternetPrePaid;

	public void setInternetPrePaid() throws InterruptedException {
		waitForElementToAppearWithText(GetaNewLineTitle, driver, "Get a New Line");
		InternetPrePaid.click();
		waitForElementToAppearWithText(MobilePrePaidTitle, driver, "Select your base plan");
	}
	/////////
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Get a New Line\"]")
	private WebElement getNewLine;

	////////
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Internet - 5G\"])[2]")
	private WebElement InternetPostpaidTitle;
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Postpaid\"])[2]")
	private WebElement InternetPostpaid;

	public void setInternetPostpaid() throws InterruptedException {
		waitForElementToAppearWithText(GetaNewLineTitle, driver, "Get a New Line");
		InternetPostpaid.click();
		waitForElementToAppearWithText(InternetPostpaidTitle, driver, "Internet - 5G");
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"VACANT\"])[1] | (//android.widget.TextView[@text=\"PURPLE\"])[1]")
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
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Choose your favorite device\"]")
	private WebElement ChooseFavourite;

	public void setChooseFavourite() {
		ChooseFavourite.click();
	}
	
	@AndroidFindBy(accessibility = "Add As Primary Device")
	private WebElement AddPrimaryDevice;

	public void setAddPrimaryDevice()  {
		AddPrimaryDevice.click();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add\"]")
	private WebElement AddAccessoriesDevice;

	public void setAddAccessoriesDevice()  {
		AddAccessoriesDevice.click();
	}
	
	@AndroidFindBy(accessibility = "Get my SIM delivered")
	private WebElement SimDeliver;

	public void setSimDeliver()  {
		SimDeliver.click();
	}
	@AndroidFindBy(accessibility = "Add As Accessory")
	private WebElement AddAsAccessory;

	public void setAddAsAccessory()  {
		AddAsAccessory.click();
	}

	@AndroidFindBy(accessibility = "youth Plans, youth Plans")
	private WebElement youthPlansTitle;

	public void setyouthPlansTitle()  {
		youthPlansTitle.click();
	}

	public void setSwipeDown() throws InterruptedException  {
		scrollActionTwo("down");
		Thread.sleep(2000);
		scrollActionTwo("down");
		Thread.sleep(2000);
		scrollActionTwo("down");
		Thread.sleep(2000);
		scrollActionTwo("down");
	}

	
}
