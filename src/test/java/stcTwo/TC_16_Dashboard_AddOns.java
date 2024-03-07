package stcTwo;

import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.androidTwo.AddOnsPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.stc.pageObjects.androidTwo.UnBilledAmountPage;
import org.testng.annotations.Test;

public class TC_16_Dashboard_AddOns extends BaseTest {

	@Test
	public void sc_Dashboard_AddOns() throws Exception  	 {
		
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
		
		//profile.setViewBill();
	//Pay Advance
		Thread.sleep(10000);
		profile.setAddOns();
		AddOnsPage addOn = new AddOnsPage(driver);
		addOn.checkSubscribePage();
		profile.setViewAll();
//InterNational	
		addOn.setKD();
		addOn.checkSubscribePage();
		
//Extra
			addOn.setExtra();
			addOn.setKD();
			addOn.checkSubscribePage();
		
//Roaming
				addOn.setRoaming();
				addOn.setKD();
				addOn.checkSubscribePage();	
//Entertainment
				addOn.setEntertainment();
				addOn.setKD();
				addOn.checkSubscribePage();	
//Local
				/*
				addOn.setLocal();
				addOn.setKD();
				addOn.checkSubscribePage();
				*/
	//Boosters
				addOn.setBoosters();
				addOn.setKD();
				addOn.checkSubscribePage();




	}

}
