package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Logout {
	
	AndroidDriver driver;

	public Logout() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath="//android.widget.TextView[@text='Home']")
	WebElement hometab;
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement icon;
	
	@FindBy(xpath="//android.widget.TextView[@text='Logout']")
	WebElement logout;
	
	@FindBy(xpath="//android.widget.Button[@text='YES']")
	WebElement yesbtn;
	
	public void applogout()
	{
		hometab.click();
		icon.click();
		logout.click();
		yesbtn.click();
		
		
	}
}

