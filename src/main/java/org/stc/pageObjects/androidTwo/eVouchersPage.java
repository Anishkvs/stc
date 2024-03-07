package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class eVouchersPage extends AndroidActions {

	AndroidDriver driver;

	public eVouchersPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Evouchers_List_0")
	private WebElement EVoucherOne;
	
	public void setEVoucherOne() throws InterruptedException {
		Thread.sleep(4000);
		scrollText("eVouchers");
		EVoucherOne.click();
	}
	
	@AndroidFindBy(accessibility = "Buy")
	private WebElement BuyEVoucher;
	
	public void setBuyEVoucher() {
		BuyEVoucher.click();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"View All\"])[2]")
	private WebElement ViewAll;
	
	public void setViewAll() {
		ViewAll.click();
	}
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Evouchers_View_All\"]/android.widget.ImageView")
	private WebElement EVoucherViewAll;
	
	public void setEVoucherViewAll() {
		EVoucherViewAll.click();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"SEE ALL\"])[1]")
	private WebElement SeeAll;
	
	public void setSeeAll() {
		SeeAll.click();
	}
	@AndroidFindBy(accessibility = "Weyyak")
	private WebElement iTunesUSA;
	
	public void setiTunesUSA() {
		iTunesUSA.click();
	}
}
