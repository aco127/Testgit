package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Playlist {

	

	AndroidDriver driver;

	public Playlist() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);

	}

	@FindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")
	WebElement playlist;

@FindBy(xpath="//android.widget.TextView[@text='Sleep Tracker']")
WebElement sleeptracker;

@FindBy(xpath="//android.widget.TextView[@text='Daily Learning']")
WebElement DailyLearning;

@FindBy(xpath="//android.widget.TextView[@text='Mood Check In']")
WebElement MoodCheckIn;

@FindBy(xpath="//android.widget.TextView[@text='Activity Tracker']")
WebElement ActivityTracker ;

@FindBy(xpath="//android.widget.TextView[@text='Journal']")
WebElement Journal ;

@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
WebElement back;


public void checkPlaylist() throws InterruptedException
{
	
	playlist.click();
	Thread.sleep(1500);
	sleeptracker.click();
	Thread.sleep(2000);
	back.click();
//	AppDriver.getDriver().navigate().back();
	

	//AppDriver.getDriver().navigate().back();

	playlist.click();
	Thread.sleep(1000);
	ActivityTracker.click();
	Thread.sleep(1500);
	back.click();
	//AppDriver.getDriver().navigate().back();

	playlist.click();
	Thread.sleep(1000);
	Journal.click();
	Thread.sleep(2000);
	back.click();
	//AppDriver.getDriver().navigate().back();
	
	playlist.click();
	Thread.sleep(1000);
	DailyLearning.click();
	Thread.sleep(3000);
	back.click();

}
}