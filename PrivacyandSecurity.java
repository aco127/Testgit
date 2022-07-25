package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PrivacyandSecurity {
	
	
	AndroidDriver driver;

	public PrivacyandSecurity() 
	{
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement icon;
	
	@FindAll(@FindBy(xpath="//android.view.ViewGroup"))
	List<WebElement> profileicon;
	
	@FindBy(xpath="//android.widget.TextView[@text='Privacy & Security']")
	WebElement privacysec;
	
	@FindBy(xpath="//android.widget.TextView[@text='User Manual Document']")
	WebElement usermanual;
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	WebElement close;
	
	@FindBy(xpath="//android.widget.TextView[@text='Privacy Policy Document']")
	WebElement policydoc;
	
	@FindBy(xpath="//android.widget.TextView[@text='Terms Of Use Document']")
	WebElement termsofuse;
	
	@FindBy(xpath="//android.widget.TextView[@text='IFU Document']")
	WebElement ifu;
	
	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;
	


public void checkPrivacySecurity() throws InterruptedException
{
	Thread.sleep(1500);
	profileicon.get(4).click();
	privacysec.click();
	Thread.sleep(3000);
	usermanual.click();
	Thread.sleep(3000);
	close.click();
	policydoc.click();
	Thread.sleep(3000);
	close.click();
	termsofuse.click();
	Thread.sleep(3000);
	close.click();
	ifu.click();
	Thread.sleep(3000);
	close.click();
	back.click();		
	Thread.sleep(1000);
	back.click();
}
}