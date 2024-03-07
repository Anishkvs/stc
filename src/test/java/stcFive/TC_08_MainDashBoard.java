package stcFive;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.ReviewOrderPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.testng.annotations.Test;

public class TC_08_MainDashBoard extends BaseTest {

	@Test
	public void sc_GuestUser_MainDashBoard() throws InterruptedException {
		HomePage home = new HomePage(driver);
	   DashBoardPage dashboard = new DashBoardPage(driver);
	   ReviewOrderPage order = new ReviewOrderPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);

	   home.setExploreDevices();
		home.setExploreviewAll();
		order.setIAmAnSTCCustomer();
		login();
		order.setCompleteOrder();
		order.setRateYourExperience();
		home.getMore();
		profile.setSignOut();
		Thread.sleep(2000);
		order.swipeDownThree();
		
////////////////////		
		dashboard.setRoamingDestinationsUk();
		dashboard.setLoginToSubscribe();
		dashboard.setKD();
		Thread.sleep(2000);
		login();
		dashboard.setSubscribe();
		home.getMore();
		profile.setSignOut();
		Thread.sleep(2000);
		order.swipeDownThree();
/////////////////		
		//driver.navigate().back();
		dashboard.setRoamingViewAll();
		

	//	home.viewChooseCountry();
//home.setEVouchers();
//dashboard.setViewAllTwo();
		home.viewFindStore();
		dashboard.setViewAllTwo();
		home.viewAllStore();
		home.getFindStoreBanner();
		
		
		

	}
	
	private void login() throws InterruptedException {
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		num.enterNumber("51307734");
		num.setContinue();
		pass.enterPassword("51307734@");
		pass.setSignIn();
		profile.setNotNow();

	}

}
