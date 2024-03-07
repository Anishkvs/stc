package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BurgerPage extends AndroidActions {

	AndroidDriver driver;

	public BurgerPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"About stc\"]")
	private WebElement AboutstcTitle;

	@AndroidFindBy(accessibility = "About stc")
	private WebElement AboutUs;

	public void setAboutUs() throws InterruptedException {
		AboutUs.click();
		waitForElementToAppearWithText(AboutstcTitle, driver, "About stc");
		Thread.sleep(2000);
		driver.navigate().back();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Last Login')]")
	private WebElement LastLogin;

	public void viewLastLogin() throws InterruptedException {
		Boolean LastLoginText = LastLogin.isDisplayed();
		System.out.println("Last Login Text is displayed: " + LastLoginText);
	}

	@AndroidFindBy(accessibility = "Settings")
	private WebElement SettingsButton;

	public void setSettingsButton() throws InterruptedException {
		SettingsButton.click();
		System.out.println("Setting");
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"English\"]")
	private WebElement ArabToEnglish;

	public void setArabToEnglish() throws InterruptedException {
		Thread.sleep(1000);
		ArabToEnglish.click();
		Thread.sleep(1000);
	}
	
	@AndroidFindBy(accessibility = "Number Properties, MANAGE OR REPLACE YOUR SIM")
	private WebElement NumberProperties;

	public void setNumberProperties() throws InterruptedException {
		NumberProperties.click();
		System.out.println("Click on Number Properties");
		waitForElementToAppearWithText(PrimarySim, driver, "Primary SIM");
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Primary SIM\"]")
	private WebElement PrimarySim;

	public void setPrimarySim() throws InterruptedException {
		PrimarySim.click();
		System.out.println("Click on SIM details");
		Thread.sleep(5000);
		//waitForElementToAppearWithText(PrimarySim, driver, "Primary SIM");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@AndroidFindBy(accessibility = "Payments, CARDS AND RECURRING PAYMENTS")
	private WebElement Payments;

	public void setPayments() throws InterruptedException {
		Payments.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, '5.')]")
	private WebElement AppVersionNum;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"App Version\"]")
	private WebElement AppVersion;

	public void viewAppVersion() throws InterruptedException {
		AppVersion.isDisplayed();
		Boolean version = AppVersionNum.isDisplayed();
		System.out.println("App version is displayed: "+version);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Profile\"]")
	private WebElement Profile;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Your Profile\"]")
	private WebElement YourProfile;

	public void setCompleteYourProfile() throws InterruptedException {
		YourProfile.click();		
	//	driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		waitForElementToAppearWithText(Profile, driver, "Profile");
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Manage\"]")
	private WebElement TestNumber;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"User Management\"]")
	private WebElement UserManagement;

	public void setUserManagement() throws InterruptedException {
		UserManagement.click();
		//waitForElementToAppearWithText(UserManagement, driver, "User Management");
		Boolean num = TestNumber.isDisplayed();
		System.out.println("Manage option is displayed: "+ num);
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"qitaf\"]")
	private WebElement qitaf;

	public void setqitaf() throws InterruptedException {
		qitaf.click();
	//	waitForElementToAppearWithText(qitaf, driver, "‎qitaf");
		Thread.sleep(2000);
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Pooling')]")
	private WebElement Pooling;
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Status')]")
	private WebElement Status;
	public void setPoolingAndStatus() throws InterruptedException {
		Pooling.click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();
	}
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Biometrics Settings\"]")
	private WebElement BioMetricsPage;
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Biometrics\"]")
	private WebElement BioMetrics;
	public void setBioMetrics() throws InterruptedException {
		BioMetrics.click();
		waitForElementToAppearWithText(BioMetricsPage, driver, "Biometrics Settings");
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Security & Privacy\"]")
	private WebElement SecurityPrivacy;

	public void setSecurityPrivacy() throws InterruptedException {
		SecurityPrivacy.click();
	}
	
	
}
