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
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Choose your favorite device\"]")
	private WebElement ChoosePlan;

	public void setChoosePlan() throws InterruptedException {
		ChoosePlan.click();
	}
	
	@AndroidFindBy(accessibility= "Choose a SIM only plan")
	private WebElement ChooseSim;

	public void setChooseSim() throws InterruptedException {
		ChooseSim.click();
	}
	
	@AndroidFindBy(accessibility= "Normal SIM, GET YOUR SIM DELIVERED")
	private WebElement ChooseNormalSim;

	public void setChooseNormalSim() throws InterruptedException {
		ChooseNormalSim.click();
	}
}
