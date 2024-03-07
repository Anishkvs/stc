package stcTwo;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.androidTwo.BillPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.testng.annotations.Test;

public class TC_18_Dashboard_Bill_PostPaid extends BaseTest {

	@Test(priority=1)
	public void sc_Dashboard_PostPaid_Bill() throws Exception  	 {
		DashBoardPage profile = new DashBoardPage(driver); 
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51307734");
		num.setContinue();
		pass.enterPassword("51307734@");
		pass.setSignIn();
		profile.setNotNow();	
		Thread.sleep(10000);
	//DashBoard Bill
		bills();
		
//Home Page - Pay Bill
		home.setPayMenu();
		bills();
		//logout();
		
	}
	//@Test(priority=1)
//	public void sc_Dashboard_Prepaid_Bill() throws InterruptedException {
//		DashBoardPage profile = new DashBoardPage(driver); 
//		HomePage home = new HomePage(driver);
//		NumberPage num = new NumberPage(driver);
//		PasswordPage pass = new PasswordPage(driver);
//		home.setAlreadyCustomer();
//		num.enterNumber("50802820");
//		num.setContinue();
//		pass.enterPassword("50802820.");
//		pass.setSignIn();
//		profile.setNotNow();
//		Thread.sleep(10000);
//		//profile.viewActive();
//		profile.setAddValidity();
//		driver.navigate().back();
//		profile.setRecharge();
//		driver.navigate().back();
//
//		profile.setViewBill();
//		Thread.sleep(15000);
//		profile.viewHistoryPage();
//		driver.navigate().back();
//		logout();
//
//	}

	private void bills() throws InterruptedException {
		DashBoardPage profile = new DashBoardPage(driver); 
		BillPage bil = new BillPage(driver);
		//profile.viewActive();
		profile.setViewBill();
		Thread.sleep(15000);
		bil.viewViewBillTitle();
		//bil.viewBillShareOption();
		//bil.viewBillDownloadOption();
		bil.viewBillPDFPage();
		driver.navigate().back();
	}
	 private void logout() throws InterruptedException {
	    	HomePage home = new HomePage(driver);
			DashBoardPage profile = new DashBoardPage(driver);
			Thread.sleep(2000);
			home.getMore();
			Thread.sleep(2000);
			profile.setSignOut();
			Thread.sleep(2000);
	    }
}
