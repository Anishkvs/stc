package stcTwo;

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

public class TC_16_Get_new_line_mobile_prepaid_civil_id extends BaseTest {

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
		num.enterNumber("51602474");
		num.setContinue();
		pass.enterPassword("51602474.");
		pass.setSignIn();
		profile.setNotNow();
		Thread.sleep(5000);
		home.getE_Store();
		store.setMobileAndInternet();
		lineOne.setMobilePrePaid();
		lineTwo.setGoTwelve();
		confirm.setConfirmPlan();
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
