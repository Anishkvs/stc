package stcTwo;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.testng.annotations.Test;

public class TC_12_DashboardScenario extends BaseTest{
	
	@Test
	public void sc_DashboardScenarioVerifyScenario() throws MalformedURLException, InterruptedException {
		
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver); 
		home.setAlreadyCustomer();
		num.enterNumber("51602474");
		num.setContinue();
		pass.enterPassword("51602474.");
		pass.setSignIn();
		profile.setNotNow();
		Thread.sleep(5000);
		profile.viewPostPaidNumber();
		profile.viewPayAdvance();
		profile.viewAll();
		profile.getInKuwait();
		profile.getRoaming();
		
		
		

	}

	
}
