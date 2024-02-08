package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UnBilledAmountPage extends AndroidActions {

	AndroidDriver driver;

	public UnBilledAmountPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Roaming Internet (booster)\"]")
	private WebElement RoamingInternetBooster;

	public void viewRoamingInternetBooster() throws InterruptedException {
		Boolean roam = RoamingInternetBooster.isDisplayed();
		System.out.println("Roaming Internet Booster option is Displayed: " + roam);
		scrollText("KSA");
	}

	@AndroidFindBy(accessibility = "Pay")
	private WebElement Pay;

	public void setPay() throws InterruptedException {
		Pay.click();
	}

	@AndroidFindBy(accessibility = "Usage")
	private WebElement usage;

	public void setUsage() throws InterruptedException {
		usage.click();
	}

	@AndroidFindBy(accessibility = "Subscriptions")
	private WebElement Subscriptions;

	public void setSubscriptions() throws InterruptedException {
		Subscriptions.click();
	}

	@AndroidFindBy(accessibility = "Bills")
	private WebElement Bills;

	public void setBills() throws InterruptedException {
		Bills.click();
	}

	@AndroidFindBy(accessibility = "Recharge")
	private WebElement Recharge;

	public void setRecharge() throws InterruptedException {
		scrollText("Prepaid Balance");
		Recharge.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Your Plan\"]")
	private WebElement YourPlan;

	public void viewYourPlan() throws InterruptedException {
		Boolean plan = YourPlan.isDisplayed();
		System.out.println("YourPlan is displyed: " + plan);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Your Commitments\"]")
	private WebElement Commitments;

	public void viewCommitments() throws InterruptedException {
		Boolean commit = Commitments.isDisplayed();
		System.out.println("Commitments is displyed: " + commit);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add New\"]")
	private WebElement AddNew;

	public void viewAddNew() throws InterruptedException {
		Boolean AddNewi = AddNew.isDisplayed();
		System.out.println("Add New is displayed: " + AddNewi);
	}

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"FREE\"])[1]")
	private WebElement Free;

	public void viewFree() throws InterruptedException {
		Boolean Freei = Free.isDisplayed();
		System.out.println("'Free Options' is displayed: " + Freei);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"This Month\"]")
	private WebElement ThisMonth;

	public void viewThisMonth() throws InterruptedException {
		Boolean ThisMonthi = ThisMonth.isDisplayed();
		System.out.println("This Month is displayed on Bills: " + ThisMonthi);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"One-Time Fee\"]")
	private WebElement OneTimeFee;

	public void viewOneTimeFee() throws InterruptedException {
		Boolean OneTimeFe = OneTimeFee.isDisplayed();
		System.out.println("'One-Time Fee' is displayed on Bills: " + OneTimeFe);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Extras\"]")
	private WebElement Extras;

	public void viewExtras() throws InterruptedException {
		Boolean Extrass = Extras.isDisplayed();
		System.out.println("'Extras' is displayed on Bills: " + Extrass);
	}

	public void viewAllSubscriptionsOptions() throws InterruptedException {
		scrollText("Your Commitments");
		scrollText("Your Add-Ons");
		scrollText("Roaming Destinations");
		scrollText("Explore Boosters");
		scrollText("Explore Add-Ons");
		scrollText("Your Plan");
	}

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView")
	private WebElement SimSetting;

	public void setSimSetting() throws InterruptedException {
		SimSetting.click();
		Thread.sleep(4000);
		driver.navigate().back();
	}
}
