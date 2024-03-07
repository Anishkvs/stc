package stcTwo;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.stc.pageObjects.androidTwo.eStorePage;
import org.testng.annotations.Test;

public class TC_20_EStore extends BaseTest {
	
	@Test
	public void sc_EStore() throws Exception{
		DashBoardPage profile = new DashBoardPage(driver); 
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		eStorePage eStore = new eStorePage(driver);
		
		PostPaid_login();
		home.getEStore();
		//profile.setNotifications();
		profile.setHelpCenter();
		eStore.setSearch("Apple");
	//	Thread.sleep(4000);
	//	eStore.setSelectSearchListAndOrder();
	//	eStore.setSubmit();
	//	eStore.setRateExperience("Test", "51602474", "TestFedback");
		driver.navigate().back();
		driver.navigate().back();
		eStore.setEstoreSmartphones();
		eStore.setViewAllTwo();
		eStore.setfilter();
		Thread.sleep(10000);
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void PostPaid_login() throws Exception  	 {
		DashBoardPage profile = new DashBoardPage(driver); 
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51602474");
		num.setContinue();
		pass.enterPassword("51602474.");
		pass.setSignIn();
		profile.setNotNow();	
}
}
