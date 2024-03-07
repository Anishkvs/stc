package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class eStorePage extends AndroidActions {

	AndroidDriver driver;

	public eStorePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Network Provider\"]")
	private WebElement NetworkProvider;
	@AndroidFindBy(accessibility = "Switch to stc")
	private WebElement SwitchToStc;

	public void setSwitchToStc() throws InterruptedException {
		SwitchToStc.click();
		waitForElementToAppearWithText(NetworkProvider, driver, "Network Provider");
		Thread.sleep(2000);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Join stc\"]")
	private WebElement NewLine;
	@AndroidFindBy(accessibility = "Mobile and Internet")
	private WebElement MobileAndInternet;

	public void setMobileAndInternet() {
		MobileAndInternet.click();
		waitForElementToAppearWithText(NewLine, driver, "Join stc");
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Apple')]")
	private WebElement Apple;
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Search Devices\"]")
	private WebElement Search;
	@AndroidFindBy(accessibility = "searchInput")
	private WebElement eStoreSearch;

	public void setSearch(String text) throws InterruptedException {
		Thread.sleep(2000);
		eStoreSearch.click();
		Thread.sleep(2000);
		Search.sendKeys(text);
		Thread.sleep(5000);
		waitForElementToAppearWithText(Apple, driver, "Apple");
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Apple\"]")
	private WebElement SelectSearchList;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Order')]")
	private WebElement Order;

	public void setSelectSearchListAndOrder() throws InterruptedException {
		SelectSearchList.click();
		Thread.sleep(10000);
		Boolean order = driver.findElement(By.xpath(
				"//android.widget.TextView[contains(@text, 'Pre Order Now')] | //android.widget.TextView[contains(@text, 'Order')]"))
				.isDisplayed();
		System.out.println("Order is displyed" + order);
	}

	@AndroidFindBy(accessibility = "Submit")
	private WebElement Submit;

	public void setSubmit() {
		Submit.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Thank you for your interest in stc\"]")
	private WebElement ThankYouMessage;
	@AndroidFindBy(accessibility = "Close")
	private WebElement Close;

	public void setClose() {
		ThankYouMessage.click();
		Close.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Name\"]")
	private WebElement RateExperienceName;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Phone Number\"]")
	private WebElement RateExperienceNumber;
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]")
	private WebElement RateExperienceEmoji;
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
	private WebElement RateExperienceFeedback;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Rate your experience\"]")
	private WebElement RateExperienceSubmit;

	public void setRateExperience(String Name, String Num, String Feedback) {
		RateExperienceName.sendKeys(Name);
		RateExperienceNumber.sendKeys(Num);
		RateExperienceEmoji.click();
		RateExperienceFeedback.sendKeys(Feedback);
		RateExperienceSubmit.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue\"]")
	private WebElement Continue;
	@AndroidFindBy(accessibility = "SMARTPHONE_List_0")
	private WebElement eStoreSmartphones;

	public void setEstoreSmartphones() throws InterruptedException {
		scrollText("Smartphones");
		eStoreSmartphones.click();
		viewSpecification();
		driver.navigate().back();
		// driver.findElement(By.xpath("//android.widget.TextView[contains(@text,
		// 'Apple')]")).click();
		// driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Apple\"])[1]
		// | (//android.widget.TextView[@text=\"Samsung\"])[1] |
		// (//android.widget.TextView[@text=\"Honor\"])[1]\"")).click();
		// waitForElementToAppearWithText(Continue, driver, "Continue");

	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"SMARTPHONE_ViewAll\"]/android.widget.ImageView")
	private WebElement SmartPhoneViewAll;

	public void setSmartPhoneViewAll() throws InterruptedException {
		SmartPhoneViewAll.click();
		Thread.sleep(5000);
	}

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"View All\"])[2]")
	private WebElement ViewAll;

	public void setViewAllTwo() {
		ViewAll.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Show')]")
	private WebElement ShowAll;
	@AndroidFindBy(accessibility = "Black")
	private WebElement Black;
	@AndroidFindBy(accessibility = "BLUE")
	private WebElement BLUE;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Color\"]")
	private WebElement filterTitle;
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement filter;

	public void setfilter() throws InterruptedException {
		filter.click();
		waitForElementToAppearWithText(filterTitle, driver, "Color");
		BLUE.click();
		Black.click();
		Thread.sleep(2000);
		ShowAll.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

	@AndroidFindBy(accessibility = "ACCESSORY_List_0")
	private WebElement Wearable;

	public void setWearable() throws InterruptedException {
		Wearable.click();
		viewSpecification();
		Thread.sleep(1000);
		driver.navigate().back();
	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"ACCESSORY_ViewAll\"]/android.widget.ImageView")
	private WebElement ViewAllWearable;

	public void setViewAllWearable() throws InterruptedException {
		scrollText("Wearables");
		scrollActionTwo("down");
		ViewAllWearable.click();
		Thread.sleep(4000);
		driver.navigate().back();
	}

	public void setContinue() throws InterruptedException {
		Thread.sleep(1000);
		Continue.click();
	}

	@AndroidFindBy(accessibility = "I am an stc customer")
	private WebElement StcCustomer;

	public void setStcCustomer() {
		StcCustomer.click();
		Continue.click();
	}

	@AndroidFindBy(accessibility = "Request Call Back")
	private WebElement CallBack;

	public void setCallBack() throws InterruptedException {
		Thread.sleep(5000);
		CallBack.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"We are sorry, something went wrong!!\"]")
	private boolean WeAreSorryText;

	public void viewWeAreSorryText() {
		if (WeAreSorryText) {
			Assert.fail("We are sorry, something went wrong");
		}
	}

	@AndroidFindBy(accessibility = "ACCESSORY_TOP_List_0")
	private WebElement Accessories;

	public void setAccessories() throws InterruptedException {
		scrollText("Accessories");
		scrollActionTwo("down");
		Accessories.click();
		viewSpecification();
		driver.navigate().back();

	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"ACCESSORY_TOP_ViewAll\"]/android.widget.ImageView")
	private WebElement ViewAllAccessories;

	public void setViewAllAccessories() throws InterruptedException {
		ViewAllAccessories.click();
		Thread.sleep(4000);
		driver.navigate().back();

		// waitForElementToAppearWithText(Apple, driver, "Apple");
		// driver.navigate().back();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"View Detailed Specifications\"]")
	private WebElement viewSpecification;

	public void viewSpecification() throws InterruptedException {
		viewSpecification.click();
		Thread.sleep(1000);
		driver.navigate().back();
	}

	@AndroidFindBy(accessibility = "Evouchers_List_0")
	private WebElement EStoreVouchers;

	public void setEStoreVouchers() throws InterruptedException {
		scrollText("eVouchers");
		scrollActionTwo("down");
		EStoreVouchers.click();
		Thread.sleep(4000);
		driver.navigate().back();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"eVouchers\"]")
	private WebElement EStoreVouchersTitle;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Evouchers_View_All\"]/android.widget.ImageView")
	private WebElement viewAllEStoreVouchers;

	public void setViewAllEStoreVouchers() throws InterruptedException {
		viewAllEStoreVouchers.click();
		waitForElementToAppearWithText(EStoreVouchersTitle, driver, "eVouchers");
		Thread.sleep(2000);
		driver.navigate().back();
	}

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Samsung\"])[1]")
	private WebElement Samsung;
	@AndroidFindBy(accessibility = "categories_List_0")
	private WebElement EStoreCategories;

	public void setEStoreCategories() throws InterruptedException {
		scrollText("Categories");
		scrollActionTwo("down");
		EStoreCategories.click();
		Thread.sleep(5000);
		//waitForElementToAppearWithText(Samsung, driver, "Samsung");
		driver.navigate().back();
	}

}
