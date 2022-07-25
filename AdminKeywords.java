package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Resources.BrowserBase;

public class AdminKeywords {

	WebDriver driver;
	public static String emailcontactperson;
	public AdminKeywords(WebDriver driver) 
	{
		 this.driver = driver; 
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='InputEmail']")
	WebElement emailaddress;

	@FindBy(xpath = "//input[@id='InputPassword']")
	WebElement password;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[@class='menu-sidebar' and  contains(text(),'Reserved Words')]")
	WebElement reservwords;

	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search;
	
	@FindBy(xpath="//i[@title='Contact Persons']")
	WebElement contactperson;
	
	@FindBy(xpath="//tbody[@role='rowgroup']/tr/td[@class='mat-cell cdk-column-Email mat-column-Email ng-star-inserted']")
	WebElement resevedcontactemail;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	WebElement closebtn;
	
	@FindBy(xpath="//input[@class='ycptinput']")
	WebElement emailinput;
	
	@FindBy(xpath="//i[@class='material-icons-outlined f36']")
	WebElement go;
	
	@FindBy(xpath="//div[@class='ellipsis nw b f18']")
	WebElement subject;
	
	@FindBy(xpath="//span[contains(text(),' NLP Content')]")
	WebElement NLPcontent;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-patientName mat-column-patientName ng-star-inserted']")
	WebElement patientname;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-text_entered mat-column-text_entered ng-star-inserted']")
	WebElement textentered;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-sentiment mat-column-sentiment ng-star-inserted']")
	WebElement sentiment;
	
	@FindBy(xpath="//span[normalize-space()='Email Distribution List']")
	WebElement emaildistributionlist;
	
	@FindAll(@FindBy(xpath="//td[@class='mat-cell cdk-column-email mat-column-email ng-star-inserted']"))
	List<WebElement> distributionlistemailid;
	
	public void AdminLogin() throws InterruptedException
{
	Thread.sleep(1500);
	emailaddress.sendKeys("superadmincurio@gmail.com");
	password.sendKeys("Hftadmin@123");
	loginbtn.click();
}

public String getContactPersondeatils() throws InterruptedException
{
	Thread.sleep(4000);
	reservwords.click();
	Thread.sleep(3000);
	search.clear();
	Thread.sleep(1500);
	search.sendKeys("Harm");
	Thread.sleep(3000);
	contactperson.click();	
	Thread.sleep(3000);
	emailcontactperson= resevedcontactemail.getText();
	System.out.println("contact Person email is " +emailcontactperson);
	Thread.sleep(3000);
	closebtn.click();
	return  emailcontactperson;
	
}

public void checkcontactpersonEmail(String emailid) throws InterruptedException
{
	try {
		((JavascriptExecutor) driver).executeScript("window.open()");
		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://yopmail.com/en/");
		Thread.sleep(7000);
		//emailinput.clear();
		Thread.sleep(2000);
		//emailinput.sendKeys("deep@yopmail.com");
		emailinput.sendKeys(emailid);

		go.click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Thread.sleep(3000);
	driver.switchTo().frame("ifmail");
	Thread.sleep(3000);
	System.out.println(subject.getText());
	Assert.assertEquals(subject.getText(), "Reserve Keyword Alert", "Failed due to email");
	
}

public void checkPatientEmail() throws InterruptedException
{
	((JavascriptExecutor) driver).executeScript("window.open()");
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(2));
	driver.get("https://yopmail.com/en/");
	Thread.sleep(7000);
	emailinput.clear();
	
	emailinput.sendKeys("june@yopmail.com");
	go.click();
	Thread.sleep(3000);
	driver.switchTo().frame("ifmail");
	Thread.sleep(3000);
	System.out.println(subject.getText());
	Assert.assertEquals(subject.getText(), "Resources and Help from SuMMER Study Staff", "Failed due to email");
}

public void checkNLPcontent() throws InterruptedException 
{
	Thread.sleep(2000);
	NLPcontent.click();
	Thread.sleep(2000);
	//patientname.getText();
	Assert.assertEquals(patientname.getText(), "june", "Failed due to wrong patient name");
	System.out.println(textentered.getText());
	Assert.assertEquals(textentered.getText(), "kill", "Failed due to wrong text");
	
	System.out.println(sentiment.getText());
	
}

public void checkEmaildistributionList() throws InterruptedException
{

	Thread.sleep(1500);
	emaildistributionlist.click();
	
	Thread.sleep(2000);
	
	int emailids=distributionlistemailid.size();
	
for(int i =0;i<emailids;i++)
{
	driver.get("https://yopmail.com");
			
Thread.sleep(7000);


	emailinput.sendKeys(distributionlistemailid.get(i).getText());
	go.click();
	Thread.sleep(3000);
	driver.switchTo().frame("ifmail");
	Thread.sleep(3000);
	System.out.println(subject.getText());
	Assert.assertEquals(subject.getText(), "EPDS Alert", "Failed due to email");
}
}
}