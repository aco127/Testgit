package PageObjects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CareTeamChat {
	
	AndroidDriver driver;

	public CareTeamChat() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	
	@FindBy(xpath="//android.widget.TextView[@text='Care Team']")
	WebElement careTeam;
	
	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")
WebElement chat;
	
	@FindBy(xpath="//android.widget.EditText[@text='Write a message']")
	WebElement writeMsg;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"send\"]/android.widget.TextView")
	WebElement send;
	
	@FindBy(xpath="//android.widget.TextView[@text='Resource']")
	WebElement resource;
	
	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView")
	WebElement Schedule;
	
	@FindBy(xpath="//android.widget.TextView[@text='26']")
	WebElement twentysixdate;
	
	@FindBy(xpath="//android.widget.TextView[@text='Regular Appointment']")
	WebElement regularAppt;
	
	@FindBy(xpath="//android.widget.TextView[@text='1 on 1 Session']")
	WebElement regularsession;
	
	@FindBy(xpath="//android.widget.TextView[@text='Group Session']")
	WebElement groupsession;
	
	@FindBy(xpath="//android.widget.TextView[@text='BOOK']")
	WebElement book;
	
	@FindBy(xpath="//android.widget.ImageView")
	 WebElement back;
	

	
	
	
	
	/*WRITE MESSAGE TO CARETEAMCHAT MEMBER*/
	public void careTeamChat() throws InterruptedException
	{
		resource.click();
		careTeam.click();
		chat.click();
		writeMsg.sendKeys("Testing Message");
	send.click();
	back.click();
	Thread.sleep(500);
	back.click();
			
	}
	
	 public void clickTab()
	 {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");  
		   LocalDate now = LocalDate.now();  
		   LocalDate d = now.plusDays(5);
		   System.out.println("currentdate"+dtf.format(now)); 
		   
	int currentdate=	now.getDayOfMonth();
	int clickabledate= d.getDayOfMonth();
	System.out.println("clickedate"+clickabledate);
	AppDriver.getDriver().findElement(By.xpath("//android.widget.TextView[@text='"+clickabledate+"']")).click();
	   }

	 
	/* SCHEDULE 26 APP DATE */
	public void schedule()
	{
		resource.click();
		careTeam.click();
		Schedule.click();
		
	}
	
	public void createappt() throws InterruptedException
	{
		regularAppt.click();
		groupsession.click();
		book.click();
		Thread.sleep(2000);
		back.click();
	}
}
