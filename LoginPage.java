package PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Resources.AppDriver;
import Resources.UpdateProperty;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	AndroidDriver driver;

	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);

	}

	@FindBy(xpath = "//android.widget.Button[@text='IGNORE']")
	// @FindBy(xpath = "//android.widget.Button[@text='xys']")
	private WebElement Ignore;

	// @AndroidFindBy(xpath = "//android.widget.EditText[@text='Username...']")
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	WebElement Username;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	WebElement Password;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='LOG IN']")
	WebElement LoginBtn;
	
	@AndroidFindAll(@AndroidBy(xpath="//android.widget.TextView"))
	List<WebElement> text;
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	WebElement code;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")
	WebElement acknowledge;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='I ACCEPT']")
	WebElement accept;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	WebElement crossicon;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Resend']")
	WebElement resendbtn;
	
	public void negativelogin() throws InterruptedException
	{
		/*
		 * Username.sendKeys(""); Password.sendKeys(""); LoginBtn.click();
		 * Thread.sleep(2000); System.out.println("Email error message"
		 * +text.get(4).getText());
		 * System.out.println("Password error message"+text.get(7).getText());
		 */
		
		Thread.sleep(4000);
		Username.sendKeys("tyjk");	
		Thread.sleep(3000);
		Password.sendKeys("kshc");
		LoginBtn.click();
		Thread.sleep(3000);
		System.out.println("Email error message" +text.get(3).getText());
		System.out.println("Password error message"+text.get(7).getText());
		
	}

	public void Login() throws InterruptedException {
	 	Username.sendKeys("june@yopmail.com");Password.sendKeys("Test@1231");
	//Username.sendKeys("test731@yopmail.com");Password.sendKeys("Test@1230");
		
		//Username.sendKeys("shilpauat001@yopmail.com");Password.sendKeys("Test@1230");

//Username.sendKeys("sonalplusuat24june@yopmail.com");Password.sendKeys("Test@123");
//Username.sendKeys("bpatient@yopmail.com");	Password.sendKeys("Test@123");

//Username.sendKeys("cpatient@yopmail.com");	Password.sendKeys("Test@1230");
//Username.sendKeys("test256@yopmail.com");	Password.sendKeys("Test@1230");
//Username.sendKeys("sixjuly@yopmail.com");	Password.sendKeys("Test@1230");
//Username.sendKeys("mayuresh@yopmail.com");Password.sendKeys("Password@123");
		
	//	Username.sendKeys("story995@yopmail.com");	Password.sendKeys("Test@1231"); --UAT user
//Username.sendKeys("priya@yopmail.com");Password.sendKeys("Password@123");
//Username.sendKeys("mlptest@yopmail.com");Password.sendKeys("Password@123");
//Username.sendKeys("sakshione@yopmail.com");Password.sendKeys("Test@123");
//Username.sendKeys("test832@yopmail.com");Password.sendKeys("Test@1230");

		 LoginBtn.click();

		
	}
	
	public void resendcodeclick(String ptemail) throws InterruptedException
	{
		Thread.sleep(5000);
		Username.sendKeys(ptemail);
		Password.sendKeys("Test@1230");
		LoginBtn.click();
		Thread.sleep(3000);
		resendbtn.click();	
	}
	
	public void newUserLogin(String ptemail,String regcode) throws InterruptedException
	{
		Thread.sleep(5000);
		Username.sendKeys(ptemail);
		Password.sendKeys("Test@1230");
		LoginBtn.click();
		Thread.sleep(3000);
		code.sendKeys(regcode);		
		Thread.sleep(1000);
		acknowledge.click();
		Thread.sleep(2000);
		accept.click();
		Thread.sleep(2000);
		crossicon.click();
	//	UpdateProperty.updateconfig("Patientemail", ptemail);
	}

}
