package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Assessment {
	
	AndroidDriver driver;

	public Assessment() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath="//android.widget.TextView[@text='Assessments']")
	WebElement assessment;
	
	@FindBy(xpath="//android.widget.TextView[@text='Resource']")
	WebElement resource;
	
	@FindBy(xpath="//android.widget.TextView[@text='automation test']")
	WebElement automationsasst;
	
	@FindBy(xpath="//android.widget.TextView[@text='Good']")
	WebElement good;
	
	@FindBy(xpath="//android.widget.TextView[@text='Bad']")
	WebElement Bad;
	
@FindBy(xpath="//android.widget.TextView[@text='SAVE']")
WebElement save;

@FindBy(xpath="//android.widget.ImageView")
static WebElement back;

@FindBy(xpath="//android.widget.EditText")
WebElement textarea;
	
@FindBy(xpath = "//android.widget.Button[@text='OK']")
WebElement ok;

@FindBy(xpath="//android.widget.TextView[@text='scoreone']")
WebElement scoreone;

@FindBy(xpath="//android.widget.TextView[@text='scoretwo']")
WebElement scoretwo;



	public void assessmt() throws InterruptedException
	{
		resource.click();
		assessment.click();
		Thread.sleep(2000);
		automationsasst.click();
		Thread.sleep(1000);
		textarea.sendKeys("It was Awesome");		
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);
		ok.click();
		back.click();
		Thread.sleep(1000);
		back.click();
	}
	
	public void EPDSAsstscore() throws InterruptedException
	{
		  resource.click(); 
		  assessment.click(); 
		  Thread.sleep(2000); 
		  scoreone.click();
		  good.click(); 
		  save.click(); 
		  Thread.sleep(1000);
		  ok.click();
		  back.click();
		  Thread.sleep(1500);
		
		assessment.click();
		Thread.sleep(1500);
		scoretwo.click();
		Bad.click();
		save.click();
		Thread.sleep(1000);
		ok.click();
		back.click();
		
	}
}
