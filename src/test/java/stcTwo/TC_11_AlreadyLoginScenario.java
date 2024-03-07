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
		login();
		home.viewPayMenu();
		logout();
		//home.viewAlreadyCustomer();
	}
	
	@Test(priority=2)
    public void loginCivilId() throws InterruptedException {
    	HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		home.setAlreadyCustomer();
		num.setLoginViaCivilId();
		num.enterCivilIdNumber("288082100675");
		num.setContinue();
		pass.enterPassword("0000000..");
		pass.setSignIn();
		profile.setNotNow();
		//Thread.sleep(10000);
	    logout();
    }

    @Test(priority=3)
	public void sc_VerifyOTPPage() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		//DashBoardPage profile = new DashBoardPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51307734");
		num.setContinue();
//Forgot Pass		
		pass.setForgotYourPassword();
		num.setContinue();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();
		pass.setLoginSMS();
		pass.setSendCode();
		Thread.sleep(2000);
		pass.setEnterFourDigitText();
	//	pass.setOTPOne("1");
		//Thread.sleep(8000);	
}
   //@Test(priority=4)
	public void sc_VerifyForgotPasswordButton() throws MalformedURLException, InterruptedException {
		NumberPage num = new NumberPage(driver);
		driver.navigate().back();
		num.setForgotPass();
		
}
    
    
    public void login() throws InterruptedException {
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
		//Thread.sleep(5000);
    }
    
    public void logout() throws InterruptedException {
    	HomePage home = new HomePage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
    	home.getMore();
		profile.setSignOut();
    }
    
}
