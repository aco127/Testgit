package PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Resources.UpdateProperty;

public class HospitalPortal {

	WebDriver driver;
	List<String> emaildistribution;

	public HospitalPortal(WebDriver driver) 
	{
		 this.driver = driver; 
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='InputEmail']")
	WebElement emailaddress;

	@FindBy(xpath = "//input[@id='exampleInputPassword1']")
	WebElement password;

	@FindBy(xpath="//input[@formcontrolname='superadminpassword']")
	WebElement superadminpwd;
	
	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement loginbtn;
	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Patient List']")
	WebElement patientlist;

	@FindBy(xpath="//button[normalize-space()='Add Patient']")
	WebElement addpatient;

	@FindBy(xpath="//button[normalize-space()='Register Patient']")
	WebElement registerpatient;
	@FindBy(xpath="//input[@placeholder='Search by first/last/phone/email']")
	WebElement searchPatient;
	@FindBy(xpath="//td[@role='gridcell']/span")
	WebElement statusData;

	@FindBy(xpath=" //input[@formcontrolname='firstName']")
	WebElement firstname;

	@FindBy(xpath="//input[@formcontrolname='middleName']")
	WebElement middlename;

	@FindBy(xpath="//input[@formcontrolname='lastName']")
	WebElement lastname;

	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement email;

	@FindBy(xpath="//span[normalize-space()='Email Distribution List']")
	WebElement emaildistributionlist;
	
	@FindAll(@FindBy(xpath="//td[@class='mat-cell cdk-column-email mat-column-email ng-star-inserted']"))
	List<WebElement> emaillist;
	
	@FindBy(xpath="//div[@class='ellipsis nw b f18']")
	List<WebElement> emailsubject;
	
	@FindBy(xpath="//div[@class='lms' and contains(text(),'EPDS Alert')]")
	WebElement epdsmail;
	
	@FindBy(xpath="//mat-select[@formcontrolname='countryCode']")
	WebElement country;

	@FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='United States']")
	WebElement selectcountry;

	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement phoneno;


	@FindBy(xpath="//mat-select[@formcontrolname='preferredGender']")
	WebElement prefgender;


	@FindBy(xpath="//span[normalize-space()='She/her']")
	WebElement sheher;

	@FindBy(xpath="//div[@class='submit_referal']/button[@class='mat-raised-button save-btn-modal']")
	WebElement savebtn;

	@FindBy(xpath="//button[@class='mat-raised-button close-btn-modal closebtn']")
	WebElement closebtn;

	@FindBy(xpath="//div[@class='mat-form-field-infix']/input")
	WebElement searchpt;

	@FindBy(xpath="//i[@title='Caretaker List']")
	WebElement caretakerlist;

	@FindBy(xpath="//div[@class='mat-form-field-infix']/input[@placeholder='Search by first/last name']")
	WebElement searchcaretaker;

	@FindBy(xpath="//td[@class='text-center']/input[@type='checkbox']")
	WebElement selectcaretaker;

	@FindBy(xpath="//button[@class='mat-raised-button save-btn-modal' and text()=' Save']")
	WebElement save;

	@FindBy(xpath="//i[@class='fa fa-trash delete-icon']")
	WebElement deleteicon;
	
	@FindBy(xpath="//button[normalize-space()='Yes, delete it!']")
	WebElement deletbtn;
	
	String url = "https://yopmail.com/en/";


	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	WebElement checkinbox;

	@FindBy(xpath = "//span[@class='lmf' and text()='CURIO']")
	WebElement mailinbox;

	@FindBy(xpath = "//a[contains(text(),'click here')]")
	WebElement registerlink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitbtn;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	WebElement regemail;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement pwd;

	@FindBy(xpath = "//input[@formcontrolname='cpassword']")
	WebElement confpwd;
	
	@FindBy(xpath="//div[@class='lms' and contains(text(),'Welcome to the SuMMER Study mobile application!')]")
	WebElement welcomemail;
	
@FindBy(xpath="//div[@id='mail']//p")
	WebElement code;
	
	@FindAll(@FindBy(tagName = "(//p[@style=\"text-align: justify; font-family: Cocogoose; margin: 60px; font-size: 20px\"]/br[9]/following::text())[1]"))
	WebElement regcoden;
	
@FindBy(xpath="//div[@class='lms' and contains(text(),'CURIO Registration Code')]")
WebElement regcodemail;

@FindBy(xpath="//div[@class='lms']")
WebElement mailsubj;

	/*
	 * // @FindBy(xpath=
	 * "//mat-select[@id='mat-select-8']//div[@class='mat-select-arrow']")
	 * 
	 * @FindBy(xpath = "//mat-select[@formcontrolname='countryCode']") WebElement
	 * country;
	 * 
	 * @FindBy(xpath = "//span[contains(text(),'United States ')]") WebElement
	 * selectcountry;
	 * 
	 * @FindBy(xpath = "//mat-select[@formcontrolname='preferredGender']")
	 * WebElement prefgender;
	 * 
	 * @FindBy(xpath = "//span[normalize-space()='She/her']") WebElement sheher;
	 */

	@FindBy(xpath = "//button[@aria-label='Open calendar']//span[@class='mat-button-wrapper']//*[name()='svg']")
	WebElement Calendar;
	
	

	@FindBy(xpath = "//div[@class='mat-calendar-body-cell-content' and text()='1']")
	WebElement selectdate;

	@FindBy(xpath = "//input[@formcontrolname='zipcode']")
	WebElement zipcode;

	// button[@class='btn btn-add-con-next mat-button mat-button-base
	// ng-star-inserted' and @type='submit']
	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()=' Next ']")
	WebElement nextbtn;

	//@FindBy(xpath = "//span[contains(text(),' NewData')]/preceding-sibling::div")
	@FindBy(id="mat-checkbox-1")
	WebElement data;

	@FindBy(id="mat-input-9")
	WebElement type;
	
	@FindBy(xpath="//div[@class='ng-star-inserted']/mat-radio-button[@id='mat-radio-2']")
	WebElement radio;
	
	@FindBy(xpath = "//button[@class='btn-add-con-next mat-button mat-button-base ng-star-inserted']/span[@class='mat-button-wrapper']")
	WebElement nextbutn;

	@FindBy(xpath = "//textarea[@id='mat-input-35']")
	WebElement testdata;
	@FindBy(xpath = "//input[@class='ycptinput']")
	WebElement yopemail;

	@FindBy(xpath = "//button[@type='submit']/span[ text()=' Submit ']")
	WebElement submit;
	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Program']")
	WebElement program;

	@FindBy(xpath="//td[normalize-space()='CU001']//following::td/img[@title='Assign Patient']")
	WebElement CU001;

	@FindBy(xpath="//mat-select[@formcontrolname='patient_ids']//div[@class='mat-select-arrow']")
	WebElement Pids;
	
	@FindBy(xpath="//span[@class='mat-option-text']")
	WebElement selectpatient;
	
	@FindBy(xpath="//button[@class='mat-raised-button sym-btn' and text()=' Submit ']")
	WebElement Submit;
	

	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Assessment']")
	WebElement Assessment;

	@FindBy(xpath="//button[@class='btn btn-add-con' and text()=' Assign to Patient ']")
	WebElement Assigntopt;

	@FindBy(xpath="//mat-select[@formcontrolname='patientName']//div[@class='mat-select-arrow']") 
	WebElement Patientdropdown;

	@FindBy(xpath="//mat-select[@formcontrolname='assessmentId']//div[@class='mat-select-arrow']")
	WebElement Assessmentdropdown;



	@FindBy(xpath="//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")
	WebElement Backdrop;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='Daily Assessment']")
	WebElement DailyAssessment;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='EPDS Assessment ']")
	WebElement EPDS;
	
	@FindBy(xpath="//span[@class='mat-option-text' and text()='scoreone']")
	WebElement scoreone;
	
	@FindBy(xpath="//span[@class='mat-option-text' and text()='scoretwo']")
	WebElement scoretwo;

	@FindBy(xpath="//button[@class='mat-raised-button save-btn-modal floatRight' and text()=' Submit ']")
	WebElement Submitasst;
	
	@FindBy(xpath="//a[normalize-space()='DOWNLOAD NOW(iOS)']")
	WebElement ioslink;
	
	@FindBy(xpath="//div[@class='beta-status']/span")
	WebElement beta;
	
	public void HospitalLogin() throws InterruptedException 
	{
		
		Thread.sleep(1500);
		emailaddress.sendKeys("hospital@yopmail.com");
		password.sendKeys("Hftadmin@123");
		loginbtn.click();
	}

	public void superAdminLogin() throws InterruptedException
	{
		Thread.sleep(1500);
		emailaddress.sendKeys("superadmincurio@gmail.com");
		superadminpwd.sendKeys("Hftadmin@123");
		loginbtn.click();
	}
	
	public void getEmaildistributionListmail() throws InterruptedException
	{
		
		Thread.sleep(1500);
		emaildistributionlist.click();
		
		int x =emaillist.size();
		System.out.println(x);
		
		for(int i=0;i<x;i++)		
		{
			System.out.println(emaillist.get(i).getText());
			String emailid=(emaillist.get(i).getText());
		
			 ((JavascriptExecutor) driver).executeScript("window.open()");
			 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			 
			 driver.switchTo().window(tabs.get(i+1));
			 driver.get("https://yopmail.com");
			 yopemail.sendKeys(emailid);
			
			Thread.sleep(1000);
			checkinbox.click();
			Thread.sleep(1000);
			driver.switchTo().frame("ifinbox");
			
			epdsmail.click();
			Thread.sleep(1500);
			String text= epdsmail.getText();
			Assert.assertEquals(text, "EPDS Alert", "Mail not received");		
			driver.switchTo().defaultContent();
			//driver.switchTo().window(text)
			driver.switchTo().window(tabs.get(0));
			System.out.println("I value"+i);
			
			
		}
		
	//	return emaildistribution;
	
		
	}
	
	public void checkepdsmail(String email)throws InterruptedException
	{
				driver.get("https://yopmail.com");
			
				((JavascriptExecutor) driver).executeScript("window.open()");
				  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				  driver.switchTo().window(tabs.get(1));
				  
				//driver.navigate().to("https://yopmail.com/en/");
				driver.get("https://yopmail.com/en/");
				yopemail.sendKeys(email);
				Thread.sleep(1000);
				checkinbox.click();
				driver.switchTo().frame("ifmail");
				Thread.sleep(9000); 
	
	}
	
	public void addpatient(String fname,String mname,String lname,String emailid,String Phoneno) throws InterruptedException
	{
		Thread.sleep(4000);
		patientlist.click();
		Thread.sleep(4000);
		addpatient.click();
		Thread.sleep(4000);
		firstname.sendKeys(fname);
		Thread.sleep(4000);
		middlename.sendKeys(mname);
		Thread.sleep(4000);
		lastname.sendKeys(lname);
		Thread.sleep(4000);
		email.sendKeys(emailid);
		Thread.sleep(4000);
		country.click();
		Thread.sleep(4000);
		selectcountry.click();
		Thread.sleep(4000);
		phoneno.sendKeys(Phoneno);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(prefgender)).click();
	
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(sheher)).click();
	
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(savebtn)).click();
		
	
	}
	
	
	public void checkstatus(String emailid) throws InterruptedException

	{
		Thread.sleep(1500);
		patientlist.click();
		Thread.sleep(2000);
		searchPatient.sendKeys(emailid);
		Thread.sleep(2000);
		searchPatient.clear();//div[@class='mat-select-arrow-wrapper'
		Thread.sleep(5000);
		searchPatient.sendKeys(emailid);
		Thread.sleep(4000);
		String actualtooltip = statusData.getAttribute("title");
		System.out.println("Actual title:"+actualtooltip);
		System.out.println("CHECK COLOUR");		
	}
	
	public void emailcheckforaddedPatient(String email,String confpaswd,String passwd,String czipcode) throws InterruptedException
	{
		 try {
			((JavascriptExecutor) driver).executeScript("window.open()");
			  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs.get(1));
			  
			//driver.navigate().to("https://yopmail.com/en/");
			driver.get("https://yopmail.com/en/");
			yopemail.sendKeys(email);
			Thread.sleep(1000);
			checkinbox.click();
			driver.switchTo().frame("ifmail");
			Thread.sleep(9000); 
			registerlink.click(); 
			Thread.sleep(1000);
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(2));
			Thread.sleep(1500);
			pwd.sendKeys("Test@1230");
			confpwd.sendKeys("Test@1230"); 
			Thread.sleep(2000); 
			Calendar.click();
			Thread.sleep(1000); 
			selectdate.click(); 
			Thread.sleep(1000);
			zipcode.sendKeys(czipcode); 
			submit.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String  getRegCode(String ptemail) throws InterruptedException
	{
		
		  ((JavascriptExecutor) driver).executeScript("window.open()");
		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(2));
		 
		driver.get("https://yopmail.com/en/");
		
		Thread.sleep(2000);
		yopemail.clear();
		Thread.sleep(2000);
		yopemail.sendKeys(ptemail);
		Thread.sleep(1000);
	checkinbox.click();
		Thread.sleep(2000);

		//Thread.sleep(2000);
		driver.switchTo().frame("ifmail");
		Thread.sleep(2000);
		String regcode= code.getText();
		System.out.println(regcode.substring(677, 684));
		
		String text= regcode.substring(678, 684);
		UpdateProperty.updateconfig("Registrationcode", regcode);
		
		
		ioslink.click();
	//	driver.switchTo().window(tabs.get(3));
	
	  ArrayList<String> tabss = new ArrayList<String>(driver.getWindowHandles());
	  //driver.switchTo().window(tabss.get(3));
	  System.out.println(tabss.size());
	 
		  
		
		Thread.sleep(2500);
	driver.switchTo().window(tabss.get(tabss.size()-1));	
	System.out.println(beta.getText());
	String expectedText="To join the CU001QA beta, open the link on your iPhone, iPad, or Mac after you install TestFlight.";
	Assert.assertEquals(beta.getText(), expectedText, "Message not same");
		
		/*
		 * UpdateProperty up = new UpdateProperty(); up.updateconfig("Registrationcode",
		 * text);
		 */
		
		return text;
		
	}
	
	public void    checkregcoderesendemail(String ptemail) throws InterruptedException
	{
		 ((JavascriptExecutor) driver).executeScript("window.open()");
		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(2));
		 
		driver.get("https://yopmail.com/en/");
		
		Thread.sleep(2000);
		yopemail.clear();
		Thread.sleep(2000);
		yopemail.sendKeys(ptemail);
		Thread.sleep(1000);
		checkinbox.click();
		Thread.sleep(4000);
		driver.switchTo().frame("ifinbox");
		Thread.sleep(2000);
		Assert.assertTrue((emailsubject.get(0).getText().contains("CURIO Resend Code")), "Didnt had required subject");
		System.out.println(emailsubject.get(0).getText());
		
		//regcodemail.click();
		//Thread.sleep(2000);
		driver.switchTo().frame("ifmail");
	}

	public void assignpatientPPD() throws InterruptedException 
	{
		 ((JavascriptExecutor) driver).executeScript("window.open()");
		  ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tab.get(0));
		program.click();
		CU001.click();
		Thread.sleep(2000);
		Pids.click();
		Thread.sleep(1000);
		selectpatient.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		Submit.click();
		System.out.println("CU001 assigned successfully");
	}
	
	public void assignAssessment() throws InterruptedException
	{
		Assessment.click();
		Thread.sleep(3000);
		Assigntopt.click();
		Thread.sleep(3000);
	Patientdropdown.click();
	Thread.sleep(3000);
	selectpatient.click();
	Thread.sleep(3000);
	Actions action = new Actions(driver);
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(3000);
			
			//BAckArrow.click();
			
			Assessmentdropdown.click();
			Thread.sleep(2000);
			/*
			 * DailyAssessment.click(); Thread.sleep(3000); EPDS.click();
			 */
			
			
			scoreone.click();
			Thread.sleep(2000);
			scoretwo.click();
			Thread.sleep(2000);
			action.sendKeys(Keys.TAB).build().perform();
			Submitasst.click();		
			System.out.println("Assessment assigned successfully");
	}

}
