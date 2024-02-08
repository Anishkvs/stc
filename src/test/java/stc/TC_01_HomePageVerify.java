package stc;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.stc.pageObjects.android.AmountChoosePage;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;

public class TC_01_HomePageVerify extends BaseTest{
	
	//@BeforeMethod
	public void preSetup() {
			driver.executeScript("mobile: startActivity",ImmutableMap.of("appPackage", "com.pixilapps.selfcare", "appActivity", "com.mystc.MainActivity"));

	}
	@Test
	public void sc_HomePageVerify() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		home.viewHomeMenu();
		home.viewEStoreMenu();
		home.viewPointsMenu();
		home.viewMoreMenu();

		home.viewHello();
		home.viewEnglishToArabTransulate();
		home.viewWelcomeText();
		home.viewAlreadyCustomer();
		home.viewQuickPay();
		home.viewRecharge();
		home.viewExploreDevices();
		home.viewRoamingDestinations();
		home.viewEVouchers();
		home.viewStcNews();
		home.viewFindStore();
		home.viewFollowUs();

	}

}
