package stcTwo;

import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.stc.pageObjects.androidTwo.UnBilledAmountPage;
import org.testng.annotations.Test;

public class TC_15_Dashboard_PayAdvance extends BaseTest {

	@Test
	public void sc_Dashboard_PayAdvance() throws Exception  	 {
		
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver); 
		PaymentPage pay = new PaymentPage(driver);
		AmountEditPage edit = new AmountEditPage(driver);
		UnBilledAmountPage bill = new UnBilledAmountPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51307734");
		num.setContinue();
		pass.enterPassword("51307734@");
		pass.setSignIn();
		profile.setNotNow();	
	//Pay Advance
		//Thread.sleep(10000);
		profile.setPayAdvance();
		profile.viewQuickPay();
		/*
		edit.setEditFirst();
		edit.setEditAmountOne();
		edit.setEditAmount("2");
		edit.setContinueButton();
		Thread.sleep(2000);
		*/
		edit.setContinueButton();
//Card verify
		pay.setAddCard();		
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

		home.setPayMenu();
		profile.setPayAdvance();
		profile.viewQuickPay();
	}

}
