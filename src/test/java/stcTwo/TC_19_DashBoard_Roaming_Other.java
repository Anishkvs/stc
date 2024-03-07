package stcTwo;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.stc.pageObjects.androidTwo.RoamingPage;
import org.stc.utils.AndroidActions;
import org.testng.annotations.Test;

public class TC_19_DashBoard_Roaming_Other extends BaseTest {

	@Test
	public void RoamingDestination() throws Exception {
		DashBoardPage profile = new DashBoardPage(driver); 
		RoamingPage roaming = new RoamingPage(driver);
		PostPaid_login();
		profile.setNotifications();
		profile.setHelpCenter();
		
		profile.setRoamingDestinationsUk();
		roaming.viewRoamingDestinationsSubscribe();
		driver.navigate().back();
		profile.setRoamingViewAll();
	//	Thread.sleep(4000);
		roaming.setUAE();
		roaming.viewRoamingDestinationsSubscribe();
		roaming.setRoamingKD();
		roaming.setRoamingSubscribe();
		roaming.setRoamingCancel();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

	}
	
	private void PostPaid_login() throws Exception  	 {
		DashBoardPage profile = new DashBoardPage(driver); 
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51307734");
		num.setContinue();
		Thread.sleep(5000);
		pass.enterPassword("51307734@");
		pass.setSignIn();
		profile.setNotNow();	
	
}
}
