package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Appinfo {
	
	AndroidDriver driver;

	public Appinfo() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='App Info']")
	WebElement appinfo;
	
	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement icon;
	
	@FindAll(@FindBy(className="android.widget.TextView"))
	List<WebElement> text;


public void checkappinfo() throws InterruptedException
{
	icon.click();
	Thread.sleep(1000);
	appinfo.click();
	Thread.sleep(1500);
	
	for (int i=1;i<11;i++)
	{
	
	String Text= text.get(i).getText();
	System.out.println(Text);
	
	}
	
	back.click();
	back.click();
	back.click();
	back.click();
}
}