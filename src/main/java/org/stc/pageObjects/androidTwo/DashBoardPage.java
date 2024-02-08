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
	
	public void setPayAdvance() {
		PayAdvance.click();
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

	public void getRoaming() throws Exception {
		//swipeFromBottomToTop(driver);
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
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Roaming Internet – Other Countries\"]")
	private WebElement RoamingInterNetTitle;

	public void viewRoamingInterNetTitle() {
		Boolean RoamingTitle =RoamingInterNetTitle.isDisplayed();
		System.out.println("Roaming InterNet Title is displayed: " + RoamingTitle);
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\" GB Available\"])[1]")
	private WebElement GBAvailableText;

	public void viewGBAvailableText() {
		Boolean GBAvailable =GBAvailableText.isDisplayed();
		System.out.println("GB Available Text is displayed: " + GBAvailable);
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Local Minutes\"]")
	private WebElement LocalMinutes;

	public void viewLocalMinutes() {
		Boolean LocalMinute =LocalMinutes.isDisplayed();
		System.out.println("LocalMinutes Text is displayed: " + LocalMinute);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\" Mins Available\"]")
	private WebElement MinsAvailable;

	public void viewMinsAvailable() {
		Boolean MinsTextAvailable =MinsAvailable.isDisplayed();
		System.out.println("Mins Available Text is displayed: " + MinsTextAvailable);
	}
	
	public void getGBAvailable() {
		GBAvailableText.click();
	}
	public void getLocalMinutes() {
		LocalMinutes.click();
	}
	
	public void getViewAll() {
		viewAll.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement viewBill;
	
	public void viewBill() {
		viewBill.click();
		}
	
	public void setManageAllSubscriptions() {
		scrollText("Your Package");
		ManageAllSubscriptions.click();
		}
}
