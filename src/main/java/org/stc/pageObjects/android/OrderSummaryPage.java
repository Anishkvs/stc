package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OrderSummaryPage extends AndroidActions {

	AndroidDriver driver;

	public OrderSummaryPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Pay")
	private WebElement Pay;

	public void setPay() throws InterruptedException  {
		Pay.click();
	}
	public void viewPay() throws InterruptedException  {
		Pay.isDisplayed();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Change\"])[1]")
	private WebElement ChangeCalander;

	public void setChangeCalander() throws InterruptedException  {
		ChangeCalander.click();
	}
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Add a delivery address, Add\"]/android.view.ViewGroup | (//android.widget.TextView[@text=\"Change\"])[2]")
	private WebElement ChangeAddress;

	public void setChangeAddress() throws InterruptedException  {
		ChangeAddress.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Edit\"]")
	private WebElement EditProfile;

	public void setEditProfile() throws InterruptedException  {
		EditProfile.click();
	}
	
	@AndroidFindBy(accessibility = "MORNING, 9AM TO 12PM")
	private WebElement selectDeliveryTime;

	public void setSelectDeliveryTime() throws InterruptedException  {
		selectDeliveryTime.click();
		 Thread.sleep(1000);
	}
	
	@AndroidFindBy(accessibility = "Continue to Checkout")
	private WebElement ContinueToCheckout;

	public void setContinueToCheckout() throws InterruptedException  {
		ContinueToCheckout.click();
	}
	
	@AndroidFindBy(accessibility = "Normal SIM, GET YOUR SIM DELIVERED")
	private WebElement NormalSIM;

	public void setNormalSIM() throws InterruptedException  {
		NormalSIM.click();
	}
	
	@AndroidFindBy(accessibility = "eSIM, GET AN ELECTRONIC SIM CARD")
	private WebElement eSIM;

	public void seteSIM() throws InterruptedException  {
		eSIM.click();
	}
	@AndroidFindBy(accessibility = "Email Address*-input")
	private WebElement EmailAddress;

	public void setEmailAddress(String email) throws InterruptedException  {
		EmailAddress.clear();
		EmailAddress.sendKeys(email);
	}
	
	@AndroidFindBy(accessibility = "Confirm Location")
	private WebElement ConfirmLocation;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Select Location\"]")
	private WebElement Location;

	public void setLocation() throws InterruptedException  {
		Location.click();
		Thread.sleep(1000);
		ConfirmLocation.click();
		}
	
	@AndroidFindBy(accessibility = "Ahmadi Governorate")
	private WebElement AhmadiGovernorate;
	@AndroidFindBy(accessibility = "Governorate, Select")
	private WebElement GovernorateSelect;

	public void setGovernorateSelect() throws InterruptedException  {
		//GovernorateSelect.click();
		//AhmadiGovernorate.click();
	}
	
	@AndroidFindBy(accessibility = "Sabah Al Ahmad Sea City")
	private WebElement SelectCityName;
	@AndroidFindBy(accessibility = "City/Area, Select")
	private WebElement SelectCity;

	public void setSelectCity() throws InterruptedException  {
		//SelectCity.click();
		Thread.sleep(1000);
		//SelectCityName.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Type Here\"]")
	private WebElement EnterHouse;

	public void setEnterHouse(String house) throws InterruptedException  {
		EnterHouse.sendKeys(house);
	}
	@AndroidFindBy(xpath = "(//android.widget.EditText[@text=\"Type Here\"])[2]")
	private WebElement EnterHouseTwo;

	public void setEnterHouseTwo(String house) throws InterruptedException  {
		Thread.sleep(2000);
		EnterHouseTwo.sendKeys(house);
	}
	
	
}
