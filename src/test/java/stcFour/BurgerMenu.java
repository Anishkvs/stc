package stcFour;

import org.stc.pageObjects.android.AmountChoosePage;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.androidTwo.BurgerPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.testng.annotations.Test;

public class BurgerMenu extends BaseTest {

	@Test(priority=1)
	public void sc_burgerMenuSettings() throws InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		AmountChoosePage amount = new AmountChoosePage(driver);
		PaymentPage pay = new PaymentPage(driver);
		BurgerPage menu = new BurgerPage(driver);

		login();
		home.getMore();
		menu.viewLastLogin();
		menu.setSettingsButton();
	//	menu.viewAppVersion();

		menu.setCompleteYourProfile();
		home.setEnglishToArabTransulate();
		Thread.sleep(2000);
		menu.setArabToEnglish();
		menu.setNumberProperties();
		menu.setPrimarySim();

		menu.setPayments();
		pay.setCardAndRecurringPay();
// hold: pay.setAddCard();
		pay.setAutoPay();

		menu.setUserManagement();
// Qitaf
		menu.setqitaf();
		menu.setPoolingAndStatus();
		
//Security & Privacy	
		menu.setSecurityPrivacy();
		menu.setBioMetrics();
		driver.navigate().back();
		driver.navigate().back();

		home.getMore();
		menu.setAboutUs();
		// 

	}
	
	//@Test(priority=2)
	public void DashBoardDetails() {
		DashBoardPage dashboard = new DashBoardPage(driver);
		
		dashboard.viewPostPaidNumber();
		dashboard.viewSubScribeName();
		
	}

	private void login() throws InterruptedException {
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
		// Thread.sleep(5000);
	}

}
