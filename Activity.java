package PageObjects;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Resources.AppDriver;
import Resources.Base;
import Utils.DateUtils;
import Utils.MobileActions;
import Utils.PointExcel;
import Utils.Scroll;
import Utils.WriteExcel;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Activity {

	AndroidDriver driver;

	public Activity() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);

	}

	@FindBy(xpath = "//android.widget.TextView[@text='SAVE']")
	private WebElement save;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	WebElement ok;

	@FindBy(xpath = "//android.widget.TextView[@text='+']")
	WebElement addactivity;

	@FindBy(xpath = "//android.widget.EditText[@text='Search activity by name (ex: Sport)']")
	WebElement searchactivity;

	@FindBy(xpath = "//android.widget.TextView[@text='DayDream']")
	WebElement Dayactivityday;

	@FindBy(xpath = "//android.widget.TextView[@text='SAVE']")
	WebElement saveact;

	@FindBy(xpath = "//android.widget.TextView[@text='yoga']")
	WebElement yoga;

	@FindBy(xpath = "//android.widget.TextView[@text='walk']")
	WebElement walk;

	@FindBy(xpath = "//android.widget.TextView[@text='Movietv']")
	WebElement Movietv;

	@FindBy(xpath = "//android.widget.TextView[@text='Daily Activities']")
	WebElement DailyActivities;

	@FindBy(xpath = "//android.widget.TextView[@text='ShoweringBathing']")
	WebElement ShoweringBathing;

	@FindBy(xpath = "//android.widget.TextView[@text='Gettingdressed']")
	WebElement Gettingdressed;

	@FindBy(xpath = "//android.widget.TextView[@text='SAVE']")
	WebElement SAVEall;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	WebElement Points;

	@FindBy(xpath = "//android.widget.TextView[@text='What activities have you done?']")
	WebElement activity;

	@FindBy(xpath = "//android.widget.TextView[@text='Resource']")
	WebElement resource;

	@FindBy(xpath = "//android.widget.TextView[@text='Birds']")
	WebElement Birds;

	@FindBy(xpath = "//android.widget.TextView[@text='Report']")
	WebElement report;

	@FindBy(xpath = "//android.widget.TextView[@text='Weekly Activity Report']")
	AndroidElement WeeklyActivityReport;

	@FindBy(xpath = "//android.widget.TextView[@text='Home']")
	AndroidElement Home;

	@FindBy(xpath = "//android.widget.TextView[@text='Points']")
	AndroidElement points;
	@FindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
	WebElement getpoints;

	@FindBy(id = "android:id/message")
	WebElement message;

	@FindAll(@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"))
	List<WebElement> actReportdata;
	
	@FindBy(xpath="//android.widget.TextView[@text='Monthly']")
	WebElement monthlypoints;
	
	@FindBy(xpath="//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
	WebElement totalpoints;
	

	@FindBy(xpath="//android.widget.TextView[@text='Weekly']")
	WebElement weeklypoints;
	
	@FindBy(xpath="//android.widget.ImageView")
	 WebElement back;
	
	

	String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;

	public void checkactivitysavepopup() throws InterruptedException {
		save.click();
		Thread.sleep(1000);
		ok.click();
	}

	public void addpleasantactivity() throws InterruptedException

	{
		Thread.sleep(2000);
		addactivity.click();
		Thread.sleep(1000);
		searchactivity.sendKeys("Day");
		Dayactivityday.click();
		saveact.click();

		try {
			String actualText = message.getText();

			if (actualText.contains("100")) {
				System.out.println("Validation of 100 Points received Successful on ActivityData");
				Thread.sleep(2000);
				ok.click();
			}
			// Thread.sleep(2000);
			ok.click();

		} catch (NoSuchElementException | StaleElementReferenceException e) {
			// e.printStackTrace();
		}

		Thread.sleep(2000);
		saveact.click();

	}

	public void adddailyactivity() throws InterruptedException {
		activity.click();
		Birds.click();
		DailyActivities.click();
		yoga.click();
		walk.click();
		Movietv.click();
		// Thread.sleep(2000);
		// DailyActivities.click();
		ShoweringBathing.click();
		Gettingdressed.click();
		SAVEall.click();

	}

	/*
	 * public void verifyactivityonresourcereport() throws InterruptedException {
	 * resource.click(); report.click();
	 * Scroll.scrollTo("Your total Points for the week"); Scroll.presskeydown();
	 * 
	 * Thread.sleep(1500); int size = actReportdata.size(); String arr = null;
	 * String act = null; List<String> arrlist = new
	 * ArrayList<String>(Arrays.asList(arr));
	 * 
	 * 
	 * ArrayList<String> scripts = new ArrayList<String>(); scripts.add("DayDream");
	 * scripts.add("yoga"); scripts.add("walk"); scripts.add("Movietv");
	 * scripts.add("ShoweringBathing"); scripts.add("Gettingdressed");
	 * 
	 * 
	 * 
	 * for (int x = 0; size > x; x++) {
	 * System.out.println(actReportdata.get(x).getText()); act =
	 * actReportdata.get(x).getText(); arrlist.add(act);
	 * 
	 * } Thread.sleep(2000);
	 * if(Arrays.asList(act).containsAll(Arrays.asList(scripts))) {
	 * System.out.println("Report contains all act" +scripts); } else {
	 * System.out.println("Didnt contain following activity" +act); }
	 * 
	 * Scroll.Takess(); AppDriver.getDriver().navigate().back(); Home.click();
	 * 
	 * }
	 */

	
	public void checkactivityUnderReportsandSelected() throws InterruptedException
	{
		resource.click();
		report.click();
		Scroll.scrollTo("Your total Points for the week");
		Scroll.presskeydown();

		Thread.sleep(1500);
		for(int i=0;i<actReportdata.size();i++)
		
		{
			String actnam= actReportdata.get(i).getText();
		
		//	System.out.println("activityname is"+actnam);
			//String arr1[]= {a1,a2,a3,a4,a5,a6};
			String arr1[]= {"DayDream","yoga","walk","Movietv","ShoweringBathing","Gettingdressed"};
			String arr2[]= {actnam};
		//	System.out.println("arr1 is"+Arrays.toString(arr1));
			//System.out.println("arr2 is" +Arrays.toString(arr2));
				//Arrays.asList(arr1).containsAll(Arrays.asList(actnam))	;
				if(Arrays.toString(arr1).contains(actnam))
				{
//					System.out.println("matched");
				}
				else
				{
					System.out.println("Didnt match" +actnam);
				}
//				Back.goback();
		}
	}	
	
	public void checkpointsTab()
	{
		points.click();
		String dailypoints=totalpoints.getText();
		weeklypoints.click();
		String weeklypoints=totalpoints.getText();
		monthlypoints.click();
		String monthlypoints= totalpoints.getText();
		
		if(dailypoints==weeklypoints &&monthlypoints==weeklypoints)
		{
			System.out.println("Total points Matched");
		}
		else {
			System.out.println("Total points data didnt match");
		}
		
	}
	/*
	 * public void checkpoints() throws Exception { points.click(); String point =
	 * getpoints.getText(); int number = Integer.parseInt(point);
	 * 
	 * System.out.println(" Activity Point is no " + number);
	 * 
	 * PointExcel.writetosheet(point, 1, "Sheet1");
	 * 
	 * AppDriver.getDriver().navigate().back(); }
	 */
}