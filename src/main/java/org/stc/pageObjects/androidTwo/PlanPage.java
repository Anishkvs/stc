package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PlanPage extends AndroidActions {

	AndroidDriver driver;

	public PlanPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Confirm Plan")
	private WebElement ConfirmPlan;

	public void setConfirmPlan() throws InterruptedException {
		ConfirmPlan.click();
	}
	
	@AndroidFindBy(accessibility = "Choose your favorite device, You can get a primary device and Secondary Device.")                                                                                                                                                                                                                                                      
	private WebElement ChoosePlan;

	public void setChoosePlan() throws InterruptedException {
		ChoosePlan.click();
	}
}
