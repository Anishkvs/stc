package stcFour;

import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.DeviceAndAccessories;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.stc.pageObjects.androidTwo.UnBilledAmountPage;
import org.testng.annotations.Test;

public class TC_13_Subscription_Upgrade_ComparePlan extends BaseTest{
	
	@Test
	public void sc_Subscription_Upgrade_ComparePlan() throws Exception  	 {
		
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver); 
		PaymentPage pay = new PaymentPage(driver);
		AmountEditPage edit = new AmountEditPage(driver);
		UnBilledAmountPage bill = new UnBilledAmountPage(driver);
		DeviceAndAccessories device = new DeviceAndAccessories(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51307734");
		num.setContinue();
		pass.enterPassword("51307734@");
		pass.setSignIn();
		profile.setNotNow();	

		profile.getViewAll();
		bill.setSubscriptions();
		bill.setUpgrade();
		bill.setComparePackages();
		bill.setChoose();
		bill.setChangePackage();
		bill.setCancelPackage();
		bill.setChooseACommitment();

		device.setAppleDevice();
		device.setContinueOrCallBack();
		driver.navigate().back();
		driver.navigate().back();
		bill.setChangePackage();
		bill.setSubscribe();
		Thread.sleep(20000);
		/*
		profile.getRoaming();
	//Disable temp:
		//profile.viewRoamingInterNetTitle();
		System.out.println("Roaming:");
		profile.viewGBAvailableText();
		profile.getInKuwait();
		System.out.println("Kuwait:");
		profile.viewGBAvailableText();
		bill.setRecharge();
		num.enterRechargeNumber("2");
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
		//bill.viewYourPlan(); - Stale Exception
	   //	bill.viewCommitments();
     	//	bill.viewAddNew(); - Stale Exception
		//bill.viewFree();
		bill.setBills();
		
	//	bill.viewThisMonth();
	//	bill.viewOneTimeFee();
	//	bill.viewExtras();
//		
		bill.setPayAll();
		edit.setContinueButton();
		//edit.setCustom();
		//edit.setEditAmount("2");
    	//	edit.setProceed();
		Thread.sleep(4000);
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();
		
		
		*/
		

		


		
		
		

	}

	
}
