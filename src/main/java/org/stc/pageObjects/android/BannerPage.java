package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BannerPage extends AndroidActions {

	AndroidDriver driver;

	public BannerPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement bannerOne;

	public void setBannerOne() throws InterruptedException {
		bannerOne.click();
	}
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View[1]/android.view.View/android.view.View/android.widget.Image")
	private WebElement bannerMenu;

	public void viewBannerMenu() throws InterruptedException {
		Boolean menu = bannerMenu.isDisplayed();
		System.out.println("Banner Menu is displayed: "+menu);
	}
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"stc logo\"]/android.widget.Image")
	private WebElement stcLogo;

	public void viewStcLogo() throws InterruptedException {
		Boolean logo = stcLogo.isDisplayed();
		System.out.println("Banner Logo is displayed: "+logo);
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"search\"]")
	private WebElement search;

	public void viewSearch() throws InterruptedException {
		Boolean bannerSearch = search.isDisplayed();
		System.out.println("Banner Search is displayed: "+bannerSearch);
	}
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"cart\"]")
	private WebElement shoppingCart;

	public void viewShoppingCart() throws InterruptedException {
		Boolean cart = shoppingCart.isDisplayed();
		System.out.println("Banner Shopping Cart is displayed: "+cart);
	}
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"cart\"]")
	private WebElement profile;

	public void viewProfile() throws InterruptedException {
		Boolean bannerProfile = profile.isDisplayed();
		System.out.println("Banner profile is displayed: "+bannerProfile);
	}
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"All\"]")
	private WebElement All;

	public void setAll() throws InterruptedException {
		scrollText("All");
		All.click();
		Thread.sleep(2000);
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Voice\"]")
	private WebElement Voice;

	public void setVoice() throws InterruptedException {
		Voice.click();
		Thread.sleep(2000);
	}
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Internet\"]")
	private WebElement Internet;

	public void setInternet() throws InterruptedException {
		Internet.click();
		Thread.sleep(2000);
	}
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"baity\"]")
	private WebElement Baity;

	public void setBaity() throws InterruptedException {
		Baity.click();
		Thread.sleep(2000);
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Prepaid\"]")
	private WebElement Prepaid;

	public void setPrepaid() throws InterruptedException {
		Prepaid.click();
		Thread.sleep(2000);
		
	}
}
