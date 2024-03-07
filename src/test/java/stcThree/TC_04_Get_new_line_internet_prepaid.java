package stcThree;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.OrderSummaryPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.androidTwo.DashBoardPage;
import org.stc.pageObjects.androidTwo.GetNewLineFirstPage;
import org.stc.pageObjects.androidTwo.GetNewLineSecondPage;
import org.stc.pageObjects.androidTwo.PasswordPage;
import org.stc.pageObjects.androidTwo.PlanPage;
import org.stc.pageObjects.androidTwo.eStorePage;
import org.testng.annotations.Test;
import stcTwo.TC_11_AlreadyLoginScenario;

public class TC_04_Get_new_line_internet_prepaid extends BaseTest {

	@Test
	public void sc_Get_new_line_internet_prepaid() throws MalformedURLException, InterruptedException {

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
		home.setAlreadyCustomer();
		num.enterNumber("50010470");
		num.setContinue();
		pass.enterPassword("50010470@");
		pass.setSignIn();
		profile.setNotNow();
		//Thread.sleep(5000);
		home.getEStore();
		store.setMobileAndInternet();
		lineOne.setInternetPrePaid();
		//Thread.sleep(10000);
		lineTwo.setKD();
		plan.setConfirmPlan();
//Select Sim
		plan.setChooseNormalSim();
		 lineTwo.setContinue();
		 Thread.sleep(2000);
		 lineTwo.setContinue();
///////////////////		 
		 summary.setChangeCalander();
		 summary.setSelectDeliveryTime();
		 lineTwo.setContinue();
		 
		//Update Address	
    		 summary.setChangeAddress();
			summary.setLocation();
			//summary.setGovernorateSelect();
			//summary.setSelectCity();
	//Update House
			//summary.setEnterHouse("Test");
			//driver.hideKeyboard();
			//summary.setEnterHouse("Test");
		//	summary.setEnterHouseTwo("Test");
			num.setContinue();

//////////////////		 
		 summary.setPay();
		 Thread.sleep(2000);
		 pay.setKNet();
		 Thread.sleep(2000);
//Card verify
		 pay.setAddCard(); 
		 pay.setPayKDAmount();
		
		 System.out.println("Get_new_line_Internet_prepaid_with_device");
			Thread.sleep(10000);
		/*
		 Thread.sleep(10000);
		 pay.setPayDelivery();
		 Thread.sleep(2000);
		 pay.setPayAmount();
	 	//pay.setPlaceOrder();
*/
		 
		 
//		lineOne.setVacant();
////Choose Sim	
//		Thread.sleep(2000);
//		// plan.setChooseSim();
//		 lineOne.setSimDeliver();
//		 lineTwo.setContinue();
//		summary.setSelectDeliveryTime();
//		 lineTwo.setContinue();
//		 Thread.sleep(2000);
//		 lineTwo.setContinue();
//		 Thread.sleep(2000);
//		 summary.setContinueToCheckout();

		 
		 
		 
//		 
/////////////////////////////////////		 	 
//		lineTwo.setFortyFive();
//		plan.setConfirmPlan();
//		lineOne.setVacant();
////Choose Your device	
//		Thread.sleep(2000);
//		plan.setChoosePlan();
//		lineOne.setAddDevice();
////Choose Apple Devices	
//		device.setAppleDevice();
//		Thread.sleep(1000);
//		num.setContinue();
////Ad as Primary Devices
//		lineOne.setAddPrimaryDevice();
//		num.setContinue();
//		summary.setChangeCalander();
//		summary.setSelectDeliveryTime();
//		num.setContinue();
//		summary.setChangeAddress();
//		Thread.sleep(1000);
//		num.setContinue();
//		Thread.sleep(1000);
//		summary.setEditProfile();
//		Thread.sleep(1000);
//		num.setContinue();
//		Thread.sleep(1000);
//		summary.setPay();
//		Thread.sleep(1000);
//		pay.setPlaceOrder();

	}
}
