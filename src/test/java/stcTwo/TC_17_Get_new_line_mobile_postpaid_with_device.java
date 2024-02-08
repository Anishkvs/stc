package stcTwo;

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

public class TC_17_Get_new_line_mobile_postpaid_with_device extends BaseTest {

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
		num.enterNumber("50012026");
		num.setContinue();
		pass.enterPassword("0000000.");
		pass.setSignIn();
		profile.setNotNow();
		Thread.sleep(5000);
		home.getE_Store();
		store.setMobileAndInternet();
		lineOne.setMobilePostpaid();
		lineTwo.setFortyFive();
		plan.setConfirmPlan();
		lineOne.setVacant();
		plan.setChoosePlan();
		lineOne.setAddDevice();
		device.setAppleDevice();
		Thread.sleep(1000);
		num.setContinue();
		
		
		
		num.setContinue();
		summary.setChangeCalander();
		summary.setSelectDeliveryTime();
		num.setContinue();
		summary.setChangeAddress();
		Thread.sleep(1000);
		num.setContinue();
		Thread.sleep(1000);
		summary.setEditProfile();
		Thread.sleep(1000);
		num.setContinue();
		Thread.sleep(1000);
		summary.setPay();
		Thread.sleep(1000);
		pay.setPlaceOrder();

	}
}
