package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GetNewLineSecondPage extends AndroidActions {

	AndroidDriver driver;

	public GetNewLineSecondPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"go 12\"]")
	private WebElement GoTwelve;

	public void setGoTwelve() throws InterruptedException {
		GoTwelve.click();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"go 5\"]")
	private WebElement GoFive;

	public void setGoFive() throws InterruptedException {
		GoFive.click();
	}
	
	@AndroidFindBy(accessibility = "ComparePackages")
	private WebElement ComparePackages;

	public void setComparePackages() throws InterruptedException {
		ComparePackages.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"KD 45 \"]")
	private WebElement FortyFive;

	public void setFortyFive() throws InterruptedException {
		FortyFive.click();
	}

}
