package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Notification {
	
	AndroidDriver driver;

	public Notification()
	{
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}
	
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement icon;
	
	@FindBy(xpath="//android.widget.TextView[@text='Notification']")
	WebElement notificationtab;
	
	
	@FindAll(@FindBy(className="android.widget.Switch"))
	List<WebElement> switchtab;
	
	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;
	
	
	public void checknotification() throws InterruptedException
	{
		icon.click();
		notificationtab.click();
		switchtab.get(0).click();
		switchtab.get(1).click();
		switchtab.get(2).click();
		Thread.sleep(1000);
		back.click();
		Thread.sleep(1000);
		back.click();
		Thread.sleep(1000);
	
	}

}
