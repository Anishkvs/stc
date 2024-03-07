package stcThree;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.OrderSummaryPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.androidTwo.PlanPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.GetNewLineFirstPage;
import org.stc.pageObjects.androidTwo.GetNewLineSecondPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.stc.pageObjects.androidTwo.eStorePage;
import org.testng.annotations.Test;

import stcTwo.TC_11_AlreadyLoginScenario;

//Mobile Prepaid Normal Sim
public class TC_01_Get_new_line_mobile_prepaid extends BaseTest {

	@Test
	public void sc_GetNewLineMobilePrepaid() throws MalformedURLException, InterruptedException {

		HomePage home = new HomePage(driver);
		TC_11_AlreadyLoginScenario log = new TC_11_AlreadyLoginScenario();
		eStorePage store = new eStorePage(driver);
		GetNewLineFirstPage lineOne = new GetNewLineFirstPage(driver);
		GetNewLineSecondPage lineTwo = new GetNewLineSecondPage(driver);
		PlanPage confirm = new PlanPage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		OrderSummaryPage summary = new OrderSummaryPage(driver);
		PaymentPage pay = new PaymentPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("50010470");
		num.setContinue();
		pass.enterPassword("50010470@");
		pass.setSignIn();
		profile.setNotNow();
	//	Thread.sleep(5000);
		home.getEStore();
		store.setMobileAndInternet();
		lineOne.setMobilePrePaid();
		lineTwo.setKD();
		//lineTwo.setGoTwelve();
		confirm.setConfirmPlan();
//Choose e-Sim 
		summary.seteSIM();
		num.setContinue();
		summary.setEmailAddress("test@test.com");
		num.setContinue();
		summary.viewPay();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
//	
//Choose Normal sim
		confirm.setConfirmPlan();
		summary.setNormalSIM();
		num.setContinue();
		Thread.sleep(4000);
		num.setContinue();
//Update Delivery Time	
		
		summary.setChangeCalander();
		summary.setSelectDeliveryTime();
		num.setContinue();
//Update Address		
		summary.setChangeAddress();
		summary.setLocation();
	//	summary.setGovernorateSelect();
	//	summary.setSelectCity();
//Update House
	//	summary.setEnterHouse("Test");
	//	driver.hideKeyboard();
	//	summary.setEnterHouse("Test");
		num.setContinue();
		summary.setPay();
//Card verify
		pay.setAddCard();		
		pay.setPayKDAmount();
		Thread.sleep(5000);
		//pay.setPaymentFrameBox();
		//pay.setPlaceOrder();
		System.out.println("Get_new_line_mobile_prepaid_with_device");
		Thread.sleep(10000);
	}
}
