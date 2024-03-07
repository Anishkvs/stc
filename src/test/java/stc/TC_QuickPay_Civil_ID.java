package stc;

import java.net.MalformedURLException;

import org.apache.xmlbeans.impl.xb.xsdschema.Element;
import org.stc.pageObjects.android.AmountChoosePage;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.Civil_Id_OtpPage;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.testng.annotations.Test;

public class TC_QuickPay_Civil_ID extends BaseTest{

	@Test
	public void sc_CivilId_QuickPayVerify() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		AmountChoosePage amount = new AmountChoosePage(driver);
		PaymentPage pay = new PaymentPage(driver);
		Civil_Id_OtpPage otp = new Civil_Id_OtpPage(driver);
		
		home.setQuickPay();
		num.enterNumber("279040701371");
		num.setContinue();
		//otp.getBack();
		//num.enterNumber("279040701371");
		//num.getContinue();
		Thread.sleep(5000);
		otp.getOtp("9");
		
		
		
		

	}
}
