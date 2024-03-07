package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GetNewLineSecondPage extends AndroidActions {

	AndroidDriver driver;

	public GetNewLineSecondPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'go')]")
	private WebElement GoTwelve;

	public void setGoTwelve() throws InterruptedException {
		GoTwelve.click();
		Thread.sleep(5000);
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"go 5\"]")
	private WebElement GoFive;

	public void setGoFive() throws InterruptedException {
		GoFive.click();
	}
	
	@AndroidFindBy(accessibility = "ComparePackages")
	private WebElement ComparePackages;

	public void setComparePackages() throws InterruptedException {
		ComparePackages.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'KD 45')]")
	private WebElement FortyFive;

	public void setFortyFive() throws InterruptedException {
		scrollText("Always ON 45");
		Thread.sleep(2000);
		FortyFive.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Shopping Cart\"]")
	private WebElement ShoppingTitle;
	@AndroidFindBy(accessibility = "Confirm Plan")
	private WebElement ConfirmPlan;

	public void setConfirmPlan() throws InterruptedException {
		ConfirmPlan.click();
		waitForElementToAppearWithText(ShoppingTitle, driver, "Shopping Cart");
		
	}
	

	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'KD')]")
	private WebElement KD;

	public void setKD() throws InterruptedException {
		KD.click();
	}
	
	@AndroidFindBy(accessibility= "Continue")
	private WebElement Continue;

	public void setContinue() throws InterruptedException {
		Continue.click();
		 Thread.sleep(2000);
	}

	@AndroidFindBy(xpath= "//android.view.ViewGroup[@content-desc=\"Foot Locker\"] | //android.view.ViewGroup[@content-desc=\"CAREEM\"] | //android.view.ViewGroup[@content-desc=\"WAVES\"] | //android.view.ViewGroup[@content-desc=\"SHEIN\"]")
	private WebElement YouthPageLogo;
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Plan Details\"]")
	private WebElement YouthPageTitle;
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"youth 7\"]")
	private WebElement Youth_7;

	public void setYouth_7() throws InterruptedException {
		Youth_7.click();
		waitForElementToAppearWithText(YouthPageTitle, driver, "Plan Details");
	//	YouthPageLogo.click();
		YouthPageTitle.click();
		
	}
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"youth 11\"]")
	private WebElement Youth_11;

	public void setYouth_11() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().back();
		Youth_11.click();
		waitForElementToAppearWithText(YouthPageTitle, driver, "Plan Details");
	}
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"youth 22\"]")
	private WebElement Youth_22;

	public void setYouth_22() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().back();
		Youth_22.click();
		waitForElementToAppearWithText(YouthPageTitle, driver, "Plan Details");
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"youth 22\"]")
	private WebElement YouthPlan22;

	public void setYouthPlan22() throws InterruptedException {
		Boolean plan = YouthPlan22.isDisplayed();
		System.out.println("YouthPlan 22 is displayed"+plan);
		 
	}
	
	
}
