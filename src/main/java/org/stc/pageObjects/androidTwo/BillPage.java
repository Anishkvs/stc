package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BillPage extends AndroidActions {

	AndroidDriver driver;

	public BillPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Bill Details\"]")
	private WebElement BillDetails;

	public void viewViewBillTitle() {
	Boolean BillTitle=	BillDetails.isDisplayed();
	System.out.println("'Bill Details' Title is displayed: "+ BillTitle);
		}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
	private WebElement BillShareOption;

	public void viewBillShareOption() {
	Boolean BillShare=	BillShareOption.isDisplayed();
	System.out.println("'Bill Share Option' is displayed: "+ BillShare);
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView")
	private WebElement BillDownloadOption;

	public void viewBillDownloadOption() {
	Boolean BillDownload=	BillDownloadOption.isDisplayed();
	System.out.println("'Bill Download Option' is displayed: "+ BillDownload);
	}
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout")
	private WebElement BillPDFPage;

	public void viewBillPDFPage() {
	Boolean BillPDF=	BillPDFPage.isDisplayed();
	System.out.println("'Bill PDF PrintOut' is displayed: "+ BillPDF);
	}
}
