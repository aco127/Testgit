package PageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Resources.AppDriver;
import Utils.PointExcel;
import Utils.Scroll;
import Utils.WriteExcel;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SleepTracker {
	AndroidDriver driver;

	public SleepTracker() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='How did you sleep last night?']")
	private WebElement sleep;
	// @FindBy(xpath = "//android.widget.TextView[@text='▲']")
	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
	WebElement selecthr;

	@FindBy(xpath = "//android.widget.TextView[@text='08']")
	WebElement selectsleephr;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView")
	WebElement selectmin;

	@FindBy(xpath = "//android.widget.TextView[@text='45']")
	WebElement selectsleepmin;

	@FindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")
	WebElement InitialSleep;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement sleepscale;
	int x = 612;
	int y = 4163;

	//@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView")
	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement energyscale;
	
	
	int ex = 566;
	int ey = 715;

	@FindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
	WebElement getpoints;

	@FindBy(xpath = "//android.widget.TextView[@text='ADD TRACKING']")
	WebElement addtracking;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	WebElement ok;

	@FindBy(xpath = "//android.widget.TextView[@text='Resource']")
	WebElement resource;

	@FindBy(xpath = "//android.widget.TextView[@text='Report']")
	WebElement report;

	@FindBy(xpath = "//android.widget.TextView[@text='Points']")
	WebElement points;

	@FindBy(id = "android:id/message")
	WebElement message;
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	WebElement okbtn;
	
	public void negselect() throws InterruptedException
	{
		Scroll.scrollIntoViewn("ADD TRACKING");
		Thread.sleep(2000);
		addtracking.click();
		okbtn.click();
		Scroll.scrollIntoViewn("Select Date");
	}
	public void selectsleeptime() throws InterruptedException {

		Thread.sleep(1000);
		selecthr.click();
		Thread.sleep(2000);
		selectsleephr.click();
		 Thread.sleep(1000);
		selectmin.click();
		selectsleepmin.click();
	//	Thread.sleep(3000);
		Scroll.swipeElement(InitialSleep, x, y);
//		Thread.sleep(1500);
		Scroll.scrollIntoViewn("ADD TRACKING");
		
		Scroll.swipeElement(energyscale, ex, ey);
		
		Scroll.scrollIntoViewn("ADD TRACKING");
//		Thread.sleep(2000);
		addtracking.click();

		try {
			String actualText = message.getText();
			if (actualText.contains("100"))
			{
				System.out.println("Validation of 100 Points received Successful on Sleep Tracker");
			}

			ok.click();
			
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	public void checksleepreport() throws InterruptedException {
		sleep.click();
		Scroll.scrollIntoViewn("Sleep Quality by weekly");
		AppDriver.getDriver().navigate().back();
		resource.click();
		report.click();
		Thread.sleep(3000);
		AppDriver.getDriver().navigate().back();
	}

	public void entersecondsleep() throws InterruptedException {
		sleep.click();
		selecthr.click();
		selectsleephr.click();
		selectmin.click();
		selectsleepmin.click();

		Scroll.swipeElement(InitialSleep, x, y);

		Thread.sleep(1500);

		Scroll.swipeElement(energyscale, ex, ey);
		
		Scroll.scrollIntoViewn("ADD TRACKING");
		Thread.sleep(1000);
		
		addtracking.click();
		SoftAssert s = new SoftAssert();

		try {

			ok.click();
			
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	public void checksleeppoints() throws Exception {

		points.click();
		String point = getpoints.getText();

		// int number = Integer.parseInt(point);

		System.out.println(" Sleep Points is " + point);
//		PointExcel.writetosheet(point, 0, "Sheet1");

		// Scroll.Takess();
	AppDriver.getDriver().navigate().back();

	}

}