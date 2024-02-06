package stc;

import java.net.MalformedURLException;

import org.stc.pageObjects.android.AmountChoosePage;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.testng.annotations.Test;

public class TC_quickPay_Multiple_Line_Postpaid extends BaseTest {

	@Test
	public void sc_quickPay_Multiple_Line_Postpaid_Scenario() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		AmountChoosePage amount = new AmountChoosePage(driver);
		PaymentPage pay = new PaymentPage(driver);
		String num1 ="51602474";
		String num2 = "51601159";
		home.setQuickPay();
		num.enterNumber(num1);
		num.getContinue();
		Thread.sleep(6000);
		amountEdit.setAddNumber();
		num.enterNumber(num2);
		num.getContinue();
		Thread.sleep(6000);
		amountEdit.viewPostPaidNum1();
		amountEdit.viewPostPaidNum2();
		
		amountEdit.setEditFirst();
		amountEdit.setEditInApp("1");
		amountEdit.setContinueButton();
		amountEdit.setEditSecond();
		amountEdit.setEditInApp("1");
		amountEdit.setContinueButton();
		
		Thread.sleep(5000);
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
