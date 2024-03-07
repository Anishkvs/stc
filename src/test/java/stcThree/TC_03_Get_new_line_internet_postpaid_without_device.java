package stcThree;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.OrderSummaryPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.DeviceAndAccessories;
import org.stc.pageObjects.androidTwo.GetNewLineFirstPage;
import org.stc.pageObjects.androidTwo.GetNewLineSecondPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.stc.pageObjects.androidTwo.PlanPage;
import org.stc.pageObjects.androidTwo.eStorePage;
import org.testng.annotations.Test;
import stcTwo.TC_11_AlreadyLoginScenario;

public class TC_03_Get_new_line_internet_postpaid_without_device extends BaseTest {

	@Test
	public void sc_Get_new_line_internet_postpaid_without_device() throws MalformedURLException, InterruptedException {

		HomePage home = new HomePage(driver);
		TC_11_AlreadyLoginScenario log = new TC_11_AlreadyLoginScenario();
		eStorePage store = new eStorePage(driver);
		GetNewLineFirstPage lineOne = new GetNewLineFirstPage(driver);
		GetNewLineSecondPage lineTwo = new GetNewLineSecondPage(driver);
		PlanPage plan = new PlanPage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		OrderSummaryPage summary = new OrderSummaryPage(driver);
		PaymentPage pay = new PaymentPage(driver);
		DeviceAndAccessories device = new DeviceAndAccessories(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51307734");
		num.setContinue();
		pass.enterPassword("51307734@");
		pass.setSignIn();
		profile.setNotNow();
		//Thread.sleep(5000);
		home.getEStore();
		store.setMobileAndInternet();
		lineOne.setInternetPostpaid();
		//Thread.sleep(10000);
		lineTwo.setKD();
		plan.setConfirmPlan();
		lineOne.setVacant();
//Choose Sim	
		Thread.sleep(2000);
		 plan.setChooseSim();
		 lineOne.setSimDeliver();
		 
	//Update Address		
			summary.setLocation();
			summary.setGovernorateSelect();
			summary.setSelectCity();
	//Update House
			summary.setEnterHouse("Test");
			driver.hideKeyboard();
			summary.setEnterHouse("Test");
			num.setContinue();
	//Update Delivery Time	
			summary.setSelectDeliveryTime();
			num.setContinue();		
			Thread.sleep(2000);
			num.setContinue();		
			summary.setContinueToCheckout();
		 	pay.setPlaceOrder();

		 	System.out.println("Get_new_line_Internet_postpaid_with_device");
			Thread.sleep(10000);
			//summary.setPay();
			//pay.setPayKDAmount();

		 
		/*
		 lineTwo.setContinue();
		summary.setSelectDeliveryTime();
		 lineTwo.setContinue();
		 lineTwo.setContinue();
		 summary.setContinueToCheckout();
		 */
 		//pay.setPlaceOrder();

		 
		 }
}
