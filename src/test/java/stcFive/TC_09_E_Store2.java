package stcFive;

import org.stc.pageObjects.android.AmountChoosePage;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.androidTwo.BurgerPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.stc.pageObjects.androidTwo.eStorePage;
import org.testng.annotations.Test;

public class TC_09_E_Store2 extends BaseTest {

	@Test
	public void sc_GuestUser_E_Store() throws InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		AmountChoosePage amount = new AmountChoosePage(driver);
		PaymentPage pay = new PaymentPage(driver);
		BurgerPage menu = new BurgerPage(driver);
		DashBoardPage dashboard = new DashBoardPage(driver);
		eStorePage estore = new eStorePage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);

		home.getEStore();
	
	    estore.setSearch("Apple");
		driver.navigate().back();
		driver.navigate().back();  
		estore.setSwitchToStc();
		driver.navigate().back();
		estore.setMobileAndInternet();
		driver.navigate().back();

		estore.setEstoreSmartphones();
		//dashboard.viewAll();
		estore.setSmartPhoneViewAll();
		estore.setfilter();

//Watch		
		estore.setViewAllWearable();
		estore.setWearable();
		estore.setContinue();
		estore.setStcCustomer();
		estore.setContinue();
		num.enterNumber("51602474");
		estore.setContinue();
		pass.enterPassword("51602474.");
		pass.setSignIn();
		profile.setNotNow();
		estore.setCallBack();
		estore.viewWeAreSorryText();
		
		
		

	}

}
