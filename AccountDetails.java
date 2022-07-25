package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccountDetails {

	AndroidDriver driver;

	public AccountDetails() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath="//android.widget.TextView[@text='Home']")
	WebElement hometab;
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement icon;
	
	@FindBy(xpath="//android.widget.TextView[@text='Account']")
	WebElement accountbtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='Provider Details']")
	WebElement providerDetails;
	
	@FindBy(xpath="//android.widget.TextView[@text='Change Password']")
	WebElement changePass;
	
	@FindBy(xpath="//android.widget.TextView[@text='Personalization']")
	WebElement personalization;
		
	@FindBy(xpath="android.widget.EditText")
	WebElement hospitalname;
	
	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;
	
	
	@FindBy(xpath="//android.widget.EditText[@text='Current Password']")
	WebElement currentpass;
	
	@FindBy(xpath="//android.widget.EditText[@text='New Password']")
	WebElement newpass;
	
	@FindBy(xpath="//android.widget.EditText[@text='Confirm New Password']")
	WebElement confnewpass;
	
	@FindBy(xpath="//android.widget.TextView[@text='CHANGE PASSWORD']")
	WebElement changepass;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stress management']")
	WebElement stress;
	
	@FindBy(xpath="//android.widget.TextView[@text='feeling alone']")
	WebElement feelingalone;

	@FindBy(xpath="//android.widget.TextView[@text='SAVE']")
	WebElement save;
	
	@FindBy(xpath="//android.widget.TextView[@text='Account']")
	WebElement account;
	
	@FindBy(className="android.widget.EditText")
	WebElement hname;
	
public void checkproviderdetails()
{
icon.click();
account.click();
providerDetails.click();
String Hospitalname=	hname.getText();
System.out.println(Hospitalname);
back.click();
}


public void changepassword() throws InterruptedException
{
	changePass.click();
	currentpass.sendKeys("Test@1230");
	newpass.sendKeys("Test@1230");	
	confnewpass.sendKeys("Test@1230");
	changepass.click();
	Thread.sleep(4000);
	back.click();
}

public void personalization() throws InterruptedException
{
	Thread.sleep(1000);
	personalization.click();
	stress.click();
	feelingalone.click();	
	save.click();
	Thread.sleep(2000);
	back.click();
	Thread.sleep(1000);
	//back.click();
	back.click();
}
}