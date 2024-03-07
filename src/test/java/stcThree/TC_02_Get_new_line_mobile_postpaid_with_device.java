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

public class TC_02_Get_new_line_mobile_postpaid_with_device extends BaseTest {

	@Test
	public void sc_Get_new_line_mobile_postpaid_with_device() throws MalformedURLException, InterruptedException {

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
		lineOne.setMobilePostpaid();
		// Thread.sleep(1000);
		lineTwo.setFortyFive();
		plan.setConfirmPlan();
		//Update script
		lineOne.setVacant();
//Choose Your device	
		Thread.sleep(4000);
		plan.setChoosePlan();
		lineOne.setAddDevice();
//Choose Apple Devices	
		device.setAppleDevice();
		Thread.sleep(5000);
		num.setContinue();
//Ad as Primary Devices
		lineOne.setAddPrimaryDevice();
		lineOne.setAddAccessoriesDevice();
		device.setAppleDevice();
		Thread.sleep(5000);
		num.setContinue();
		lineOne.setAddAsAccessory();
		num.setContinue();
		Thread.sleep(2000);
		num.setContinue();
///////////
		//Update Address		
		summary.setLocation();
		System.out.println("Update the Gov and City");
		summary.setGovernorateSelect();
		summary.setSelectCity();
//Update House
		summary.setEnterHouse("Test");
		driver.hideKeyboard();
		summary.setEnterHouse("Test");
		num.setContinue();

////////		
		summary.setSelectDeliveryTime();
		num.setContinue();
		Thread.sleep(2000);
		num.setContinue();
		summary.setContinueToCheckout();
		Thread.sleep(1000);
		pay.setPlaceOrder();
		System.out.println("Get_new_line_mobile_postpaid_with_device");
		Thread.sleep(10000);

			

	}
}
