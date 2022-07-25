package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class uploadProfile {

	AndroidDriver driver;

	public uploadProfile() 
	{
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='SAVE']")
	private WebElement save;
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement icon;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='']")
	WebElement pencilicon;
	
	 @FindAll(@FindBy(xpath="//android.widget.ImageView"))
	List<WebElement> clickimage;
	 
	 @FindBy(xpath="//android.widget.Button[@text='Allow']")
	 WebElement allowtab;
	

public void takeprofile() throws InterruptedException
{
//	icon.click();
	pencilicon.click();
	Thread.sleep(1000);
	allowtab.click();
	Thread.sleep(1000);
	allowtab.click();
	Thread.sleep(1000);
	clickimage.get(0).click();
	Thread.sleep(1500);
	clickimage.get(1).click();
	
}


}