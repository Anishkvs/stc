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

public class TC_13_Dashboard_Usage_Subscription_Recharge_PayBill extends BaseTest{
	
	@Test
	public void sc_Dashboard_Usage_Subscription_Recharge_PayBill() throws Exception  	 {
		
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver); 
		PaymentPage pay = new PaymentPage(driver);
		AmountEditPage edit = new AmountEditPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51602474");
		num.setContinue();
		pass.enterPassword("51602474.");
		pass.setSignIn();
		profile.setNotNow();	

		profile.getViewAll();
		profile.getRoaming();
		UnBilledAmountPage bill = new UnBilledAmountPage(driver);
		profile.viewRoamingInterNetTitle();
		System.out.println("Roaming:");
		profile.viewGBAvailableText();
		profile.getInKuwait();
		System.out.println("Kuwait:");
		profile.viewGBAvailableText();
		bill.setRecharge();
		num.enterNumber("2");
		Thread.sleep(5000);
		num.setConfirm();
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		profile.getViewAll();
		bill.setSubscriptions();
		bill.viewYourPlan();
		bill.viewCommitments();
		bill.viewAddNew();
		bill.viewFree();
		bill.setBills();
		
		bill.viewThisMonth();
		bill.viewOneTimeFee();
		bill.viewExtras();
//		
		bill.setPay();
		edit.setCustom();
		edit.setEditAmount("2");
		edit.setProceed();
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();
		
		
		
		

		


		
		
		

	}

	
}
