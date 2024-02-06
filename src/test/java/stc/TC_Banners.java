package stc;

import java.net.MalformedURLException;

import org.stc.pageObjects.android.BannerPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.testng.annotations.Test;

public class TC_Banners extends BaseTest{

	@Test
	public void sc_BannerVerify() throws MalformedURLException, InterruptedException {

		HomePage home = new HomePage(driver);
		BannerPage banner = new BannerPage(driver);
		home.viewQuickPay();
		banner.setBannerOne();
		Thread.sleep(10000);
		banner.viewBannerMenu();
		banner.viewStcLogo();
		banner.viewSearch();
		banner.viewShoppingCart();
		banner.setAll();
		banner.setVoice();
		banner.setInternet();
		banner.setBaity();
		banner.setPrepaid();
		
		
		
	
	}
		
}
