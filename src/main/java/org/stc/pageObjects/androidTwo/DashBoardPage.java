package org.stc.pageObjects.androidTwo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DashBoardPage extends AndroidActions {

	AndroidDriver driver;

	public DashBoardPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Not Now\"]")
	private WebElement notNow;
////////
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"test\"]")
	private WebElement test;
	//////////
	public void setNotNow() throws InterruptedException {
		waitForElementToAppearWithText(notNow, driver, "Not Now");
		notNow.click();
		//Thread.sleep(5000);
	//	waitForElementToAppearWithText(test, driver, "test");
		//System.out.println("Dashboard");
	}

	@AndroidFindBy(accessibility = "Sign Out")
	private WebElement signOut;

	public void setSignOut() {
		scrollActionTwo("down");
	//	scrollText("Sign Out");
		signOut.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"51307734\"]")
	private WebElement PostPaidNumber;

	public void viewPostPaidNumber() {
		Boolean postpaid = PostPaidNumber.isDisplayed();
		System.out.println("Postpaid number is displayed: " + postpaid);
	}
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'MKT_')]")
	private WebElement PostPaidUserName;

	public void viewPostPaidUserName() {
		Boolean Name = PostPaidUserName.isDisplayed();
		System.out.println("Postpaid User Name is displayed: " + Name);
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'MKT_ UAT _ TechMahindra')]")
	private WebElement SubScribeName;

	public void viewSubScribeName() {
		Boolean name = SubScribeName.isDisplayed();
		System.out.println("SubScriber Name is displayed: " + name);
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Pay Bill')] | //android.widget.TextView[contains(@text, 'Pay Advance')]")
	private WebElement PayAdvance;
	
	public void viewPayAdvance() {
		Boolean PayAdvanceText = PayAdvance.isDisplayed();
		System.out.println("PayAdvance options is displayed: " + PayAdvanceText);
	}

	public void setPayAdvance() {
		PayAdvance.click();
	}

	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'View All')]")
	private WebElement viewAll;

	public void viewAll() {
		Boolean viewAllText = viewAll.isDisplayed();
		System.out.println("viewAll options is displayed: " + viewAllText);
	}

	@AndroidFindBy(accessibility = "In Kuwait")
	private WebElement InKuwait;
	//WebElement ele = driver.findElement(AppiumBy.accessibilityId("kuwait"));
	public void getScrollKuwait() throws InterruptedException, IOException {
		//Thread.sleep(10000);
		scrollActionTwo("down");
		System.out.println("swipe down 1");
		scrollActionTwo("down");
		Thread.sleep(1000);
		System.out.println("swipe down 1");
	//	scrollActionTwo("down");
	//	Thread.sleep(1000);
		


		//swipeActionNew("down");
	//	swipeActionNewChat("down",By.xpath("//android.widget.TextView[@text=\"Manage All Subscriptions\"]") );
		System.out.println("swipe down 1");
		Thread.sleep(1000);
		InKuwait.click();

//		swipeActionNew("down");
//		System.out.println("swipe down 2");
//		Thread.sleep(1000);

//		swipeActionNew("down");
//		Thread.sleep(2000);
//		swipeActionNew("down");
//		
		/*
		InKuwait.click();
    	Thread.sleep(2000);
		getScreenshotPathAndroid("sc_Dashboard_Your_Usage", driver);
		Thread.sleep(2000);
*/
	}
	public void getInKuwait() {
			InKuwait.click();
		}

	@AndroidFindBy(accessibility = "Roaming")
	private WebElement Roaming;

	public void getRoaming() throws Exception {
		Roaming.click();

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Manage All Subscriptions\"]")
	private WebElement ManageAllSubscriptions;

	public void viewManageAllSubscriptions() {
		scrollText("Your Package");
		Boolean ManageAll = ManageAllSubscriptions.isDisplayed();
		System.out.println("ManageAll options is displayed: " + ManageAll);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Your Commitments\"]")
	private WebElement YourCommitments;

	public void viewYourCommitments() {
		// scrollText("Your Commitments");
		Boolean YourCommitment = YourCommitments.isDisplayed();
		System.out.println("Your Commitments options is displayed: " + YourCommitment);
	}

	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Roaming Internet')]")
	private WebElement RoamingInterNetTitle;

	public void viewRoamingInterNetTitle() {
	Boolean RoamingTitle = RoamingInterNetTitle.isDisplayed();
	System.out.println("Roaming InterNet Title is displayed: " + RoamingTitle);
	}

	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'GB Available')]")
	private WebElement GBAvailableText;

	public void viewGBAvailableText() {
		Boolean GBAvailable = GBAvailableText.isDisplayed();
		System.out.println("GB Available Text is displayed: " + GBAvailable);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Local Minutes\"]")
	private WebElement LocalMinutes;

	public void viewLocalMinutes() {
		Boolean LocalMinute = LocalMinutes.isDisplayed();
		System.out.println("LocalMinutes Text is displayed: " + LocalMinute);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\" Mins Available\"]")
	private WebElement MinsAvailable;

	public void viewMinsAvailable() {
		Boolean MinsTextAvailable = MinsAvailable.isDisplayed();
		System.out.println("Mins Available Text is displayed: " + MinsTextAvailable);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\" SMS Available\"]")
	private WebElement SmsAvailable;

	public void viewSmsAvailable() {
		Boolean SMSTextAvailable = SmsAvailable.isDisplayed();
		System.out.println("SMS Available Text is displayed: " + SMSTextAvailable);
	}
	public void getGBAvailable() throws InterruptedException {
		GBAvailableText.click();
		Thread.sleep(5000);
		driver.navigate().back();
	}

	public void getLocalMinutes() {
		LocalMinutes.click();
	}

	public void getViewAll() throws InterruptedException {
		viewAll.click();
		Thread.sleep(1000);
	}

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement viewBill;

	public void viewBill() {
	    driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'View Bill')] | //android.widget.TextView[contains(@text, 'Recharge History')]")).click();
		//viewBill.click();
	}

	public void setManageAllSubscriptions() {
		scrollText("Your Package");
		ManageAllSubscriptions.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Active\"]")
	private WebElement AddOns;

	public void setAddOns() {
		scrollText("Entertainment");
		AddOns.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'ACTIVE')]")
	private WebElement Active;

	public void viewActive() {
		Boolean ActiveText = Active.isDisplayed();
		System.out.println("Active status is displayed: " + ActiveText);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"UAE\"]")
	private WebElement UAE;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"RoamingBundles_View_All\"]/android.widget.ImageView")
	private WebElement RoamingViewAll;
	
	public void setRoamingViewAll() throws InterruptedException {
		RoamingViewAll.click();
		Thread.sleep(4000);
		waitForElementToAppearWithText(UAE, driver, "UAE");
		Thread.sleep(2000);
		UAE.click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}
	public void setViewAll() {
		driver.findElement(By.xpath("(//android.widget.TextView[@text=\"View All\"])[1]")).click();
	}
	public void setViewAllTwo() {
		driver.findElement(By.xpath("(//android.widget.TextView[@text=\"View All\"])[2]")).click();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Active\"]")
	private WebElement EVouchers;

	public void setEVouchers() {
		EVouchers.click();
	}

	// @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'View
	// Bill')]")
	// private WebElement ViewBill;

	public void setViewBill() {

		driver.findElement(By.xpath(
				"//android.widget.TextView[contains(@text, 'View Bill')] | //android.widget.TextView[contains(@text, 'Recharge History')]")).click();
		// ViewBill.click();
	}

	///////
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Recharge History\"]")
	private WebElement HistoryPage;

	public void viewHistoryPage() {
		waitForElementToAppearWithText(HistoryPage, driver, "Recharge History");
		Boolean History = HistoryPage.isDisplayed();
		System.out.println("History Page is displayed: " + History);
	}

	@AndroidFindBy(accessibility = "Add Validity")
	private WebElement AddValidity;
	@AndroidFindBy(accessibility = "Validity, Validity")
	private WebElement ValidityPage;

	public void setAddValidity() throws InterruptedException {
	//	waitForElementToAppearWithText(AddValidity, driver, "Add Validity");
		AddValidity.click();
		Boolean Validity = ValidityPage.isDisplayed();
		System.out.println("Validity page is displayed: " + Validity);
	}

	@AndroidFindBy(accessibility = "Recharge Now")
	private WebElement Recharge;

	@AndroidFindBy(accessibility = "Confirm")
	private WebElement Confirm;

	public void setRecharge() throws InterruptedException {
		Thread.sleep(2000);
		Recharge.click();
		Thread.sleep(2000);
		Boolean confirm = Confirm.isDisplayed();
		System.out.println("Recharge page is displayed: " + confirm);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Login to Subscribe\"]")
	private WebElement LoginRoaming;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"UNITED KINGDOM\"]")
	private WebElement RoamingDestinationsUk;
	public void setRoamingDestinationsUk() throws InterruptedException {
		//scrollText("Roaming Destinations");
		//scrollActionTwo("down");
		RoamingDestinationsUk.click();
		Thread.sleep(2000);
		//waitForElementToAppearWithText(LoginRoaming, driver, "Login to Subscribe");
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	private WebElement Notifications;
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Notifications')]")
	private WebElement NotificationText;
	public void setNotifications() throws InterruptedException {
		Notifications.click();
		Thread.sleep(1000);
		Boolean Notification= NotificationText.isDisplayed();
		System.out.println("Notification page is displayed: "+Notification);
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
	private WebElement HelpCenter;
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Help Center')]")
	private WebElement HelpCenterText;
	
	public void setHelpCenter() throws InterruptedException {
		HelpCenter.click();
		Thread.sleep(1000);
		Boolean helpCenter = HelpCenterText.isDisplayed();
		System.out.println("Help Center page is displayed: "+helpCenter);
		driver.navigate().back();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Quick Pay\"]")
	private WebElement QuickPayTitle;

	public void viewQuickPay() throws InterruptedException {
		waitForElementToAppearWithText(QuickPayTitle, driver, "Quick Pay");
		Thread.sleep(2000);
	}
	
	@AndroidFindBy(accessibility = "Login to Subscribe")
	private WebElement LoginToSubscribe;

	public void setLoginToSubscribe() throws InterruptedException {
		LoginToSubscribe.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'KD')]")
	private WebElement KD;

	public void setKD() throws InterruptedException {
		KD.click();
		Thread.sleep(2000);
		LoginToSubscribe.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Cancel\"]")
	private WebElement Cancel;
	@AndroidFindBy(accessibility = "Subscribe")
	private WebElement Subscribe;

	public void setSubscribe() throws InterruptedException {
		Subscribe.click();
		Thread.sleep(2000);
		Cancel.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

	
	
}
