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
	@AndroidFindBy(accessibility= "Quick Pay")
	private WebElement quickPay;

	@AndroidFindBy(accessibility = "Recharge")
	private WebElement recharge;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Already a Customer?\"]")
	private WebElement AlreadyCustomer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"عربي\"]")
	private WebElement EnglishToArabTransulate;

	public void setQuickPay() {
		Boolean quick =quickPay.isDisplayed();
		System.out.println(" QuickPay is displayed: "+quick);
		quickPay.click();
	}

	public void setRecharge() {
		recharge.click();
	}

	public void viewQuickPay() {
		Boolean quick =quickPay.isDisplayed();
		System.out.println("QuickPay is displayed: "+quick);
	}

	public void viewRecharge() {
		Boolean Recharge =recharge.isDisplayed();
		System.out.println("Recharge is displayed "+Recharge);
	}
	public void viewAlreadyCustomer() {
	
		Boolean existUser =AlreadyCustomer.isDisplayed();
		System.out.println("Already a Customer is displayed: "+existUser);
	}
	public void setAlreadyCustomer() {
		AlreadyCustomer.click();
	}
	public void viewEnglishToArabTransulate() {
		Boolean transulator =EnglishToArabTransulate.isDisplayed();
		System.out.println("Transulator is displayed: "+transulator);

	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Explore Devices\"]")
	private WebElement exploreDevices;
	
	public void viewExploreDevices() {
		scrollText("Explore Devices");
		Boolean explore =	exploreDevices.isDisplayed();
		System.out.println("exploreDevices is displayed: "+explore);

	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Roaming Destinations\"]")
	private WebElement roamingDestinations;
	
	public void viewRoamingDestinations() {
		scrollText("Roaming Destinations");
		Boolean roaming =roamingDestinations.isDisplayed();
		System.out.println("Roaming Destinations is displayed: "+roaming);

	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"eVouchers\"]")
	private WebElement eVouchers;
	
	public void viewEVouchers() {
		scrollText("eVouchers");
		Boolean eVoucher = eVouchers.isDisplayed();
		System.out.println("eVouchers is displayed: "+eVoucher);

}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"stc News\"]")
	private WebElement stcNews;
	
	public void viewStcNews() {
		scrollText("stc News");
		Boolean news = stcNews.isDisplayed();
		System.out.println("stc News is displayed: "+news);

}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Find a Store or Kiosk\"]")
	private WebElement findStore;
	
	public void viewFindStore() {
		scrollText("Find a Store or Kiosk");
		Boolean store =findStore.isDisplayed();
		System.out.println("Find a Store or Kiosk is displayed: "+store);

}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"FOLLOW US\"]")
	private WebElement followUs;
	
	public void viewFollowUs() {
		Boolean follow =	followUs.isDisplayed();
		System.out.println("FollowUs is displayed: "+follow);
		//scrollText("Hello,");

}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Hello,\"]")
	private WebElement hello;
	
	public void viewHello() {
		Boolean hellowText =hello.isDisplayed();
		System.out.println("Hello is displayed: "+hellowText);
}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Welcome to mystc\"]")
	private WebElement welcomeText;
	
	public void viewWelcomeText() {
		Boolean welcome =welcomeText.isDisplayed();
		System.out.println("welcome is displayed: "+welcome);

	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"E-STORE\"]")
	private WebElement E_Store;
	
	public void getE_Store() {
		E_Store.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"MORE\"]")
	private WebElement moreMenu;
	
	public void getMore() {
		moreMenu.click();
	}
	
}
