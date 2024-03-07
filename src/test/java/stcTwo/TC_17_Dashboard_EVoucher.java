package stcTwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.androidTwo.AddOnsPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.stc.pageObjects.androidTwo.UnBilledAmountPage;
import org.stc.pageObjects.androidTwo.eVouchersPage;
import org.testng.annotations.Test;

public class TC_17_Dashboard_EVoucher extends BaseTest {

	@Test
	public void sc_Dashboard_EVoucher() throws Exception {

		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		eVouchersPage voucher = new eVouchersPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51307734");
		num.setContinue();
		pass.enterPassword("51307734@");
		pass.setSignIn();
		profile.setNotNow();
		//Thread.sleep(10000);
    	voucher.setEVoucherOne();
		buyEVouchers();
//
		voucher.setEVoucherViewAll();
		voucher.setSeeAll();
		Thread.sleep(5000);
		voucher.setiTunesUSA();
		buyEVouchers();


	}

	private void buyEVouchers() throws InterruptedException {

		PaymentPage pay = new PaymentPage(driver);
		eVouchersPage voucher = new eVouchersPage(driver);
		AddOnsPage addOn = new AddOnsPage(driver);
		addOn.setKD();
		voucher.setBuyEVoucher();
		pay.setKNet();
//Card verify
		pay.setAddCard();		
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();
		backFour();
	}
	
	private void backFour() {
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

	}
	
}
