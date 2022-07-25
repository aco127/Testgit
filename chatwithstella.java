package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class chatwithstella {
	
	AndroidDriver driver;

	public chatwithstella() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement icon;
	
	@FindBy(xpath="//android.widget.TextView[@text='Chat with Stella']")
	WebElement chatwithstella;
	
	@FindBy(className="android.widget.EditText")
	WebElement talk;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	WebElement send;
	
	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;
	
	

public void chatwithstella() throws InterruptedException
{
icon.click();
chatwithstella.click();
Thread.sleep(5000);
talk.sendKeys("Test@1230");
send.click();
back.click();
Thread.sleep(2000);
back.click();
}
}