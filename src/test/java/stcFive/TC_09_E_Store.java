package stcFive;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.androidTwo.eStorePage;
import org.testng.annotations.Test;

public class TC_09_E_Store extends BaseTest {

	@Test
	public void sc_GuestUser_E_Store() throws InterruptedException {
		HomePage home = new HomePage(driver);
		eStorePage estore = new eStorePage(driver);
	
		home.getEStore();
//Search	
		estore.setSearch("Apple");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();  
		estore.setSwitchToStc();
		driver.navigate().back();
		estore.setMobileAndInternet();
		driver.navigate().back();
//SmartPhone
		estore.setEstoreSmartphones();
		//dashboard.viewAll();
		estore.setSmartPhoneViewAll();
		estore.setfilter();
		
//Wearables		
		estore.setViewAllWearable();
		estore.setWearable();
		
//Accessories		
		estore.setAccessories();
		estore.setViewAllAccessories();
		
//eVouchers
		estore.setEStoreVouchers();
		estore.setViewAllEStoreVouchers();
		
//Categories		
		estore.setEStoreCategories();
	}

}
