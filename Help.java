package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Help {
	
	AndroidDriver driver;

	public Help() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath="//android.widget.TextView[@text='Help']")
	WebElement Help;
	
	@FindBy(xpath="//android.widget.TextView[@text='Points Total']")
	WebElement pointstotal;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	WebElement closetab;
	
	@FindBy(xpath="//android.widget.TextView[@text='Login, Privacy Policy, and Welcome screen']")
	WebElement Welcomescreen;
	
	@FindBy(xpath="//android.widget.TextView[@text='Daily Playlist and Daily Learning']")
	WebElement dailylearning;
	
	@FindBy(xpath="//android.widget.TextView[@text='Care concerns']")
	WebElement careconcern;
	
	@FindBy(xpath="//android.widget.TextView[@text='Additional Help']")
	WebElement addhelp;
	
	@FindBy(xpath="//android.widget.TextView[@text='Mood Sleep and Activity Trackers']")
	WebElement moodsleepacttrack;
	
	public void checkhelp()
	{
		Help.click();
		pointstotal.click();
}
}