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
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Change\"])[1]")
	private WebElement ChangeCalander;

	public void setChangeCalander() throws InterruptedException  {
		ChangeCalander.click();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Change\"])[2]")
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
	}
	
	
	
}
