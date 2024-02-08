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

public class TC_12_Dashboard_Your_Usage extends BaseTest{
	
	@Test
	public void sc_Dashboard_Your_Usage() throws Exception  	 {
		
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

		profile.getInKuwait();
		profile.viewPostPaidNumber();
		profile.viewPayAdvance();
    //	
		
	  	profile.getRoaming();
		//////
		profile.viewRoamingInterNetTitle();
		profile.viewGBAvailableText();
		profile.getGBAvailable();
		driver.navigate().back();
////		
		profile.getInKuwait();
		profile.viewLocalMinutes();
		profile.viewMinsAvailable();
		profile.getLocalMinutes();
		driver.navigate().back();
/// 
	
		
		

	}

	
}
