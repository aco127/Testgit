package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Language {
	
	AndroidDriver driver;

	public Language() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement icon;
	
	@FindBy(xpath="//android.widget.TextView[@text='Language']")
	WebElement language;
	
	@FindBy(xpath="//android.widget.TextView[@text='English']")
    WebElement englishlang;
	
	@FindBy(xpath="//android.widget.TextView[@text='SAVE']")
	WebElement save;
	
	@FindBy(id="android:id/button1")
	WebElement okbtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='Spanish']")
	WebElement spanishlanguage;

	@FindBy(xpath="//android.widget.TextView[@text='Idioma']")
	WebElement langspan;
	
	@FindBy(xpath="//android.widget.TextView[@text='English']")
	WebElement langeng;
	
	@FindBy(xpath="//android.widget.TextView[@text='AHORRAR']")
	WebElement langsave;

public void changelang() throws InterruptedException
{
	
	

	
	icon.click();
	Thread.sleep(1000);
	language.click();
	spanishlanguage.click();
	save.click();
	okbtn.click();
	Thread.sleep(6000);
	
	
	icon.click();
	langspan.click();
	Thread.sleep(2000);
	langeng.click();
	
	langsave.click();
	okbtn.click();
	Thread.sleep(4000);
}
}
