package stc;

import java.net.MalformedURLException;

import org.stc.pageObjects.android.AddCardPage;
import org.stc.pageObjects.android.AmountChoosePage;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class TC_AddCardScenario extends BaseTest{
	
	//@BeforeMethod
	public void preSetup() {
			driver.executeScript("mobile: startActivity",ImmutableMap.of("appPackage", "com.pixilapps.selfcare", "appActivity", "com.mystc.MainActivity"));

	}
	@Test
	public void sc_AddCardScenario() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		AmountChoosePage amount = new AmountChoosePage(driver);
		PaymentPage pay = new PaymentPage(driver);
		AddCardPage card = new AddCardPage(driver);
		home.setQuickPay();
		num.enterNumber("96676937");
		num.getContinue();
		amountEdit.setAmount();
		amount.setTwoKD();
		amount.setContinue();
		amountEdit.setContinueButton();
//Card
		pay.setAnotherCard();
		card.setExpireDate();
		card.setexpiryMonthZero();
		card.setMonth();
		card.setexpiryYearZero();
		card.setYear();
		
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();

		

	}

}
