package org.stc.pageObjects.androidTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddOnsPage extends AndroidActions {

	AndroidDriver driver;

	public AddOnsPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Not Now\"]")
	private WebElement notNow;

	public void checkSubscribePage() {
		Boolean subscribe = driver.findElement(By.xpath(
				"//android.widget.TextView[@text=\"Unsubscribe\"] | //android.widget.TextView[@text=\"Subscribe\"]"))
				.isDisplayed();
		System.out.println("Subscribe option is displayed: " + subscribe);
		driver.navigate().back();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'KD')] | //android.widget.TextView[contains(@text, 'Active')]")
	private WebElement KD;

	public void setKD() throws InterruptedException {
		Thread.sleep(2000);
		KD.click();
	}

	@AndroidFindBy(accessibility = "Extra, Extra")
	private WebElement Extra;

	public void setExtra() {
		Extra.click();
	}
	
	@AndroidFindBy(accessibility = "Roaming, Roaming")
	private WebElement Roaming;

	public void setRoaming() {
		Roaming.click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Internet\"]")).isDisplayed();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Bundles\"]")).isDisplayed();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\" Boosters\"]")).isDisplayed();
		System.out.println("Internet, Bundles, Boosters is displayed");
	}
	@AndroidFindBy(accessibility = "Boosters, Boosters")
	private WebElement Booster;

	public void setBoosters() {
		Booster.click();
	}
	@AndroidFindBy(accessibility = "Entertainment, Entertainment")
	private WebElement Entertainment;

	public void setEntertainment() {
		Entertainment.click();
		//driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Active\"])[1]")).click();
	}
	
	@AndroidFindBy(accessibility = "Local, Local")
	private WebElement Local;

	public void setLocal() {
		Local.click();
	}
}
