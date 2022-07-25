package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Resources.AppDriver;
import Utils.Scroll;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Registeration {
	AndroidDriver driver;
	public Registeration()
	{
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);	
	}

	
	//@FindBy(xpath="//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	@FindBy(xpath="//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	WebElement code;
	
	
	@FindBy(xpath="//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")
	WebElement acceptagreements;
	
	@FindBy(xpath="//android.widget.TextView[@text='I ACCEPT']")
	WebElement acceptbtn;
	
	
	public void neg_Reg() throws InterruptedException
	{
		Thread.sleep(2000);

		code.sendKeys("123232324");
		Thread.sleep(2000);
		acceptagreements.click();
		acceptbtn.click();
		Thread.sleep(2000);
		Scroll.Takess();
		Assert.fail();
		
		
	}
}
