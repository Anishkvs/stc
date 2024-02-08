package stcTwo;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.testng.annotations.Test;

public class TC_11_AlreadyLoginScenario extends BaseTest{
	
	@Test(priority=1)
	public void sc_AlreadyLoginScenario() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		login();
		home.viewPayMenu();
		home.getMore();
		Thread.sleep(2000);
		profile.setSignOut();
		Thread.sleep(2000);
		home.viewAlreadyCustomer();

	}

    @Test(priority=2)
	public void sc_AlreadyLoginInValidOTPScenario() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		//DashBoardPage profile = new DashBoardPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51602474");
		num.setContinue();
		pass.setLoginSMS();
		pass.setSendCode();
		Thread.sleep(2000);
	//	pass.setOTPOne("1");
		//Thread.sleep(8000);	
}
    
    public void login() throws InterruptedException {
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
    }
}
