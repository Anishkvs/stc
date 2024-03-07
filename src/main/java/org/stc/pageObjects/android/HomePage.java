package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends AndroidActions {

	AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// driver.findElement(AppiumBy.accessibilityId("Quick Pay")).click();
	@AndroidFindBy(accessibility = "Quick Pay")
	private WebElement quickPay;

	@AndroidFindBy(accessibility = "Recharge")
	private WebElement recharge;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Already')]")
	// @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Already a
	// Customer?\"]")
	private WebElement AlreadyCustomer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"عربي\"]")
	private WebElement EnglishToArabTransulate;

	public void setQuickPay() {
		Boolean quick = quickPay.isDisplayed();
		System.out.println(" QuickPay is displayed: " + quick);
		quickPay.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"English\"]")
	private WebElement ArabToEnglishTransulate;

	public void setArabToEnglish() {
		ArabToEnglishTransulate.click();
	}

	public void setRecharge() {
		recharge.click();
	}

	public void viewQuickPay() {
		Boolean quick = quickPay.isDisplayed();
		System.out.println("QuickPay is displayed: " + quick);
	}

	public void viewRecharge() {
		Boolean Recharge = recharge.isDisplayed();
		System.out.println("Recharge is displayed " + Recharge);
	}

	public void viewAlreadyCustomer() {

		// Boolean existUser =AlreadyCustomer.isDisplayed();
		// System.out.println("Already a Customer is displayed: "+existUser);
	}

	public void setAlreadyCustomer() {
		//waitForElementToAppearWithText(AlreadyCustomer, driver, "Already");
		AlreadyCustomer.click();
	}

	public void viewEnglishToArabTransulate() {
		Boolean transulator = EnglishToArabTransulate.isDisplayed();
		System.out.println("Transulator is displayed: " + transulator);
	}

	public void setEnglishToArabTransulate() {
		EnglishToArabTransulate.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Explore Devices\"]")
	private WebElement exploreDevices;

	public void viewExploreDevices() {
		scrollText("Explore Devices");
		Boolean explore = exploreDevices.isDisplayed();
		System.out.println("exploreDevices is displayed: " + explore);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Roaming Destinations\"]")
	private WebElement roamingDestinations;

	public void viewRoamingDestinations() {
		scrollText("Roaming Destinations");
		Boolean roaming = roamingDestinations.isDisplayed();
		System.out.println("Roaming Destinations is displayed: " + roaming);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"eVouchers\"]")
	private WebElement eVouchers;

	public void viewEVouchers() {
		scrollText("eVouchers");
		Boolean eVoucher = eVouchers.isDisplayed();
		System.out.println("eVouchers is displayed: " + eVoucher);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"stc News\"]")
	private WebElement stcNews;

	public void viewStcNews() {
		scrollText("stc News");
		Boolean news = stcNews.isDisplayed();
		System.out.println("stc News is displayed: " + news);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Find')]")
	private WebElement findStore;

	public void viewFindStore() {
		scrollText("Find a Store or Kiosk");
		Boolean store = findStore.isDisplayed();
		System.out.println("Find a Store or Kiosk is displayed: " + store);
	}
	
	@AndroidFindBy(accessibility = "Directions")
	private WebElement Directions;
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'Store')]")
	private WebElement findStoreDirections;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Kuwait International Airport - T1 Departures\"]")
	private WebElement findStoreBanner;

	public void getFindStoreBanner() throws InterruptedException {
		findStoreBanner.click();
		waitForElementToAppearWithText(findStoreDirections, driver, "Store");
		Directions.click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();

	}
	
	public void viewAllStore() {
		waitForElementToAppearWithText(findStoreDirections, driver, "Store");
        driver.navigate().back();
	}
	

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"FOLLOW US\"]")
	private WebElement followUs;

	public void viewFollowUs() {
		Boolean follow = followUs.isDisplayed();
		System.out.println("FollowUs is displayed: " + follow);
		// scrollText("Hello,");

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Hello,\"]")
	private WebElement hello;

	public void viewHello() {
		Boolean hellowText = hello.isDisplayed();
		System.out.println("Hello is displayed: " + hellowText);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Welcome to mystc\"]")
	private WebElement welcomeText;

	public void viewWelcomeText() {
		Boolean welcome = welcomeText.isDisplayed();
		System.out.println("welcome is displayed: " + welcome);

	}

	@AndroidFindBy(accessibility = "tab-Store")
	private WebElement EStore;

	public void getEStore() {
		EStore.click();
	}
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"MORE\"]")

	@AndroidFindBy(accessibility = "tab-more")
	private WebElement moreMenu;

	public void getMore() {
		System.out.println("Get More");
		moreMenu.click();
	}

	////////////////
	@AndroidFindBy(accessibility = "tab-Store")
	private WebElement EStoreMenu;

	public void viewEStoreMenu() {
		Boolean EStore = EStoreMenu.isDisplayed();
		System.out.println("E-Store is displayed: " + EStore);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"51602474 - Mkt_ Uat _ Techmahindra\"]")
	private WebElement PointsMenuTitle;
	@AndroidFindBy(accessibility = "tab-qitaf")
	private WebElement PointsMenu;

	public void setQitafMenu() {
		PointsMenu.click();
	}
	public void setPointsQitaf() {
		PointsMenu.click();
		//waitForElementToAppearWithText(PointsMenuTitle, driver, "51602474 - Mkt_ Uat _ Techmahindra");
	}
	public void viewPointsMenu() {
		Boolean Points = PointsMenu.isDisplayed();
		System.out.println("Points Menu is displayed: " + Points);
	}

	@AndroidFindBy(accessibility = "tab-more")
	private WebElement MoreMenu;

	public void viewMoreMenu() {
		Boolean More = MoreMenu.isDisplayed();
		System.out.println("MoreMenu is displayed: " + More);
	}

	@AndroidFindBy(accessibility = "tab-Home")
	private WebElement HomeMenu;

	public void viewHomeMenu() {
		Boolean home = HomeMenu.isDisplayed();
		System.out.println("HomeMenu is displayed: " + home);
	}

	@AndroidFindBy(accessibility = "tab-Pay")
	private WebElement PayMenu;

	public void viewPayMenu() {
		Boolean PayMenuOption = PayMenu.isDisplayed();
		System.out.println("Pay Menu Option is displayed: " + PayMenuOption);
	}

	public void setPayMenu() {
		PayMenu.click();
	}

	public void scrollRoaming() {
		swipeDown();
		swipeDown();
		swipeDown();
		// scrollNew();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Show all')]")
	private WebElement ShowAll;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"header-search-icon\"]/android.widget.ImageView")
	private WebElement Search;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"DeviceListFilter\"]/android.widget.ImageView")
	private WebElement Filter;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Apple\"]")
	private WebElement Apple;
	@AndroidFindBy(accessibility = "ExploreDevice_0")
	private WebElement ExploreDevices;

	public void setExploreDevices() throws InterruptedException {
		scrollActionTwo("down");
		scrollActionTwo("down");	
		System.out.println("View Explore devices");
		ExploreDevices.click();
		waitForElementToAppearWithText(Apple, driver, "Apple");
		Filter.click();
		ShowAll.click();
		
		Thread.sleep(2000);
		Search.click();	
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue\"] | //android.widget.TextView[@text=\"Pre Order Now\"]")
	private WebElement ContinueOrPreOder;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Apple\"] | //android.widget.TextView[@text=\"Samsung\"]")
	private WebElement AppleSamsung;
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'View All')]")
	private WebElement ExploreviewAll;

	public void setExploreviewAll() throws InterruptedException {
		ExploreviewAll.click();
		waitForElementToAppearWithText(Apple, driver, "Apple");
		AppleSamsung.click();
		ContinueOrPreOder.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"UAE\"]")
	private WebElement ChooseCountry;

	public void viewChooseCountry() throws InterruptedException {
		waitForElementToAppearWithText(ChooseCountry, driver, "UAE");
		ChooseCountry.isDisplayed();
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'USA')]")
	private WebElement EVouchers;

	public void setEVouchers() throws InterruptedException {
		EVouchers.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(@text, 'USA')]")
	private WebElement Facebook;

	public void setFacebook() throws InterruptedException {
		Facebook.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	
	
	
	
	

}
