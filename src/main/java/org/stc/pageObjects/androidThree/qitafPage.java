package org.stc.pageObjects.androidThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class qitafPage extends AndroidActions {

	AndroidDriver driver;

	public qitafPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'KD')]")
	private WebElement KD;

	public void setKD() throws InterruptedException {
		Thread.sleep(2000);
		KD.click();
	}
	
	@AndroidFindBy(xpath= "(//android.widget.TextView[@text=\"100 Pts\"])[1]")
	private WebElement points;
	@AndroidFindBy(accessibility = "searchInput")
	private WebElement FirstSearch;
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Search\"]")
	private WebElement Search;
	public void setSearch(String text) throws InterruptedException {
		Thread.sleep(2000);
		FirstSearch.click();
		Thread.sleep(2000);
		FirstSearch.click();
		Thread.sleep(2000);
		Search.sendKeys(text);
		driver.hideKeyboard();
	//	Thread.sleep(5000);
		waitForElementToAppearWithText(points, driver, "100 Pts");
		points.click();
		waitForElementToAppearWithText(Amount, driver, "Amount");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Amount\"]")
	private WebElement Amount;
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Pts')]")
	private WebElement ptsRewards;
	@AndroidFindBy(accessibility= "QitafRewardOffers_0")
	private WebElement ptsFirstRewards;
	public void setRewards() {
		ptsFirstRewards.click();
		waitForElementToAppearWithText(Amount, driver, "Amount");
		System.out.println("Reward page is displayed");
		driver.navigate().back();
		//driver.navigate().back();
	}
	
	@AndroidFindBy(xpath= "//android.widget.Button[@text=\"log in\"]")
	private WebElement LoginIn;
	@AndroidFindBy(xpath= "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement Banner;

	public void setBanner() throws InterruptedException {
		Banner.click();
		waitForElementToAppearWithText(LoginIn, driver, "log in");
		System.out.println("Banner page is displayed");
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Sign in\"]")
	private WebElement SignIn;
	@AndroidFindBy(accessibility = "Help Center")
	private WebElement HelpCenter;

	public void setHelpCenter() throws InterruptedException {
		HelpCenter.click();
		waitForElementToAppearWithText(WelcomeTitle, driver, "Welcome!");
		System.out.println("Sigin page is displayed");
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Welcome!\"]")
	private WebElement WelcomeTitle;
	@AndroidFindBy(accessibility = "Sign in")
	private WebElement SignInButton;
	
	public void setSignIn() throws InterruptedException {
		SignInButton.click();
		waitForElementToAppearWithText(WelcomeTitle, driver, "Welcome!");
		System.out.println("Sign In page is displayed");
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"MOBILE\"])[1]")
	private WebElement mobile;
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement Allow;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue\"]")
	private WebElement Continue;
	@AndroidFindBy(xpath= "//android.widget.ImageView[@resource-id=\"Input-Right-Accessory\"]")
	private WebElement contactOption;
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Quick Pay\"]")
	private WebElement quickPayPage;
	@AndroidFindBy(accessibility = "ENTER YOUR NUMBER-input")
	private WebElement quickPayXPath;
	@AndroidFindBy(accessibility = "Quick Pay")
	private WebElement quickPay;
	
	public void setQuickPay() throws InterruptedException {
		Thread.sleep(2000);
		quickPay.click();
		/*
		quickPayXPath.click();
		//waitForElementToAppearWithText(quickPayPage, driver, "Quick Pay");
		System.out.println("Quick Pay page is displayed");
		contactOption.click();
		Thread.sleep(2000);
		Continue.click();
		Thread.sleep(2000);
		Allow.click();
		Thread.sleep(2000);
		waitForElementToAppearWithText(mobile, driver, "MOBILE");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		*/
	}
	
	@AndroidFindBy(accessibility = "Settings")
	private WebElement setting;
	
	public void setSettings() throws InterruptedException {
		setting.click();
		waitForElementToAppearWithText(WelcomeTitle, driver, "Welcome!");
		driver.navigate().back();
	}

	public void viewStcRewards() throws InterruptedException {
		scrollText("stc Rewards");
		
	//	scrollActionTwo("down");
	}
	
	@AndroidFindBy(accessibility= "SMS")
	private WebElement SMSRewards;

	public void setSMSRewards() throws InterruptedException {
		SMSRewards.click();
	}
	
	@AndroidFindBy(accessibility= "Internet")
	private WebElement InternetRewards;

	public void setInternetRewards() throws InterruptedException {
		InternetRewards.click();
	}
	@AndroidFindBy(accessibility= "Minutes")
	private WebElement MinutesRewards;

	public void setMinutesRewards() throws InterruptedException {
		MinutesRewards.click();
	}
	
	@AndroidFindBy(accessibility= "SMS, SMS")
	private WebElement SMSTitle;
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Pts')]")
	private WebElement ptRewards;
	public void setPts() throws InterruptedException {
	//	waitForElementToAppearWithText(SMSTitle, driver, "SMS");
		Thread.sleep(5000);
		ptRewards.click();
	}
	
	@AndroidFindBy(accessibility= "Redeem Now")
	private WebElement RedeemNow;

	public void setRedeemNow() throws InterruptedException {
		RedeemNow.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Confirm\"]")
	private WebElement RedeemConfirm;

	public void setRedeemConfirm() {
		RedeemConfirm.click();
	}
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Cancel\"]")
	private WebElement RedeemCancel;

	public void setRedeemCancel() throws InterruptedException {
		Thread.sleep(2000);
		RedeemCancel.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);


	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Congratulations!\"]")
	private WebElement Congratulations;
	@AndroidFindBy(accessibility= "Close")
	private WebElement RedeemClose;

	public void setRedeemClose() {
		waitForElementToAppearWithText(Congratulations, driver, "Congratulations!");
		RedeemClose.click();
	}
	
	@AndroidFindBy(accessibility = "Internet")
	private WebElement RedeemInternet;

	public void setRedeemInternet() {
		RedeemInternet.click();
	}
}
