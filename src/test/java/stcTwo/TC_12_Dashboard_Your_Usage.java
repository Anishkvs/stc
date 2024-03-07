package stcTwo;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.testng.annotations.Test;

public class TC_12_Dashboard_Your_Usage extends BaseTest{
	
	@Test
	public void sc_Dashboard_Your_Usage() throws Exception  	 {
		
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver); 
		home.setAlreadyCustomer();
		num.enterNumber("51307734");
		num.setContinue();
		pass.enterPassword("51307734@");
		pass.setSignIn();
		profile.setNotNow();	

		profile.viewPostPaidNumber();
		//profile.viewPostPaidUserName();		
		profile.getScrollKuwait();
		
		
    //	
		profile.viewMinsAvailable();
		profile.viewSmsAvailable();
	////	
		
	  	profile.getRoaming();
		//////
		profile.viewRoamingInterNetTitle();
		profile.viewGBAvailableText();
		profile.getGBAvailable();
		
		profile.getViewAll();
////		
	  	profile.getRoaming();
		profile.viewRoamingInterNetTitle();
		profile.viewGBAvailableText();
		profile.getInKuwait();
		Thread.sleep(2000);

//Hold to verify this line, because of existing bug.

	  //profile.viewLocalMinutes();
		//profile.viewMinsAvailable();
		//profile.getLocalMinutes();
		driver.navigate().back();
/// 

	}

	
}
