package stcFive;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.androidThree.qitafPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.testng.annotations.Test;

public class TC_10_Qitaf_login extends BaseTest {

	//@Test(priority=1)
	public void sc_Qitaf_SMS_Internet_Minutes() throws InterruptedException {
		HomePage home = new HomePage(driver);
		qitafPage qitaf = new qitafPage(driver);
		
		login();
		home.setPointsQitaf();
		qitaf.viewStcRewards();
//SMS
		qitaf.setSMSRewards();
		qitaf.setPts();
		qitaf.setRedeemNow();
		qitaf.setRedeemCancel();
//Internet
		qitaf.setInternetRewards();
		qitaf.setPts();
		qitaf.setRedeemNow();
		qitaf.setRedeemCancel();
//Minutes
		qitaf.setMinutesRewards();
		qitaf.setPts();
		qitaf.setRedeemNow();
		qitaf.setRedeemCancel();
		
	}
	
	
	
	
	  private void login() throws InterruptedException  {
	    	HomePage home = new HomePage(driver);
			NumberPage num = new NumberPage(driver);
			PasswordPage pass = new PasswordPage(driver);
			DashBoardPage profile = new DashBoardPage(driver);
			home.setAlreadyCustomer();
		//	num.enterNumber("51602474");
			num.enterNumber("51307734");
			num.setContinue();
		//	pass.enterPassword("51602474.");
			pass.enterPassword("51307734@");
			pass.setSignIn();
			profile.setNotNow();
			//Thread.sleep(5000);
	    }

}
