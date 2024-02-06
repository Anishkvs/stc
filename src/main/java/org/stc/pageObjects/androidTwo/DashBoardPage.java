package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
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

	public void setNotNow() {
		notNow.click();
	}

	@AndroidFindBy(accessibility = "Sign Out")
	private WebElement signOut;

	public void setSignOut() {
		signOut.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"51602474\"]")
	private WebElement PostPaidNumber;

	public void viewPostPaidNumber() {
		Boolean postpaid = PostPaidNumber.isDisplayed();
		System.out.println("Postpaid number is displayed: " + postpaid);
	}

	@AndroidFindBy(accessibility = "Pay Advance")
	private WebElement PayAdvance;

	public void viewPayAdvance() {
		Boolean PayAdvanceText = PayAdvance.isDisplayed();
		System.out.println("PayAdvance options is displayed: " + PayAdvanceText);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"View All\"]")
	private WebElement viewAll;

	public void viewAll() {
		Boolean viewAllText = viewAll.isDisplayed();
		System.out.println("viewAll options is displayed: " + viewAllText);
	}

	@AndroidFindBy(accessibility = "In Kuwait")
	private WebElement InKuwait;

	public void getInKuwait() {
		InKuwait.click();
	}

	@AndroidFindBy(accessibility = "Roaming")
	private WebElement Roaming;

	public void getRoaming() {
		Roaming.click();
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Manage All Subscriptions\"]")
	private WebElement ManageAllSubscriptions;

	public void viewManageAllSubscriptions() {
		scrollText("Your Package");
		Boolean ManageAll =	ManageAllSubscriptions.isDisplayed();
		System.out.println("ManageAll options is displayed: " + ManageAll);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Your Commitments\"]")
	private WebElement YourCommitments;

	public void viewYourCommitments() {
	//	scrollText("Your Commitments");
		Boolean YourCommitment =	YourCommitments.isDisplayed();
		System.out.println("Your Commitments options is displayed: " + YourCommitment);
	}
}
