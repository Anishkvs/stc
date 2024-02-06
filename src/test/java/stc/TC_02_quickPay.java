package stc;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.AmountChoosePage;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.testng.annotations.Test;

public class TC_02_quickPay extends BaseTest {
/*
	// @BeforeMethod
	public void preSetup() {
		// Activity activity = new Activity("com.pixilapps.selfcare",
		// "com.mystc.MainActivity");
		driver.executeScript("mobile: startActivity",
				ImmutableMap.of("appPackage", "com.pixilapps.selfcare", "appActivity", "com.mystc.MainActivity"));

	}
*/
	@Test
	public void sc_QuickPayScenario() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		AmountChoosePage amount = new AmountChoosePage(driver);
		PaymentPage pay = new PaymentPage(driver);

		home.setQuickPay();
		num.enterNumber("51195933");
		num.setContinue();
		amountEdit.setAmount();
		amount.setTwoKD();
		////
//		amount.setEnterAmount("0");
//		amount.setclearEnterAmount();
//		amount.setEnterAmount("26");
//		amount.setclearEnterAmount();
//		
		//////
		amount.setContinue();
		amountEdit.setContinueButton();
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();

	}

	

		public void backToHome() throws InterruptedException {
		PaymentPage pay = new PaymentPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		NumberPage num = new NumberPage(driver);

		driver.navigate().back();
		pay.setPaymentBack();
		amountEdit.setClose();
		num.backButtonOnNumber();
		Thread.sleep(2000);
	}

}
