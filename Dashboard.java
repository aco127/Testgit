package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Dashboard {

	AndroidDriver driver;

	public Dashboard() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);

	}

	@FindBy(xpath = "//android.widget.TextView[@text='How did you sleep last night?']")
	private WebElement sleep;

	@FindBy(xpath = "//android.widget.TextView[@text='What activities have you done?']")
	WebElement activity;
	
	@FindBy(xpath = "//android.widget.TextView[@text='What is your mood today?']")
	WebElement mood;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Points']")
	WebElement Points;
	
	public void selectsleep() throws InterruptedException {
		Thread.sleep(5000);
		sleep.click();
		Thread.sleep(3000);

	}
	
	public void selectactivity()
	{
		activity.click();
	}
	
	public void selectmood()
	{
		mood.click();
	}
	
	public void selectpoints()
	{
		Points.click();
	}
}