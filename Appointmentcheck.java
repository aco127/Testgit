package PageObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Appointmentcheck {
	
	AndroidDriver driver;

	public Appointmentcheck() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	
	
	@FindBy(xpath="//android.widget.TextView[@text='Schedule']")
	WebElement sched;
	
	@FindAll(@FindBy(xpath="//android.widget.TextView"))
	List<WebElement> text;
	
	
	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;

	
	public void checkapptscheduled()
	{
		sched.click();
		String apptdate =text.get(7).getText();
		System.out.println(apptdate); 
		
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");  
		   LocalDate now = LocalDate.now();  
		   LocalDate d = now.plusDays(5);
		   System.out.println(dtf.format(d)); 
		   
		   int currentdate=	now.getDayOfMonth();
			int clickabledate= d.getDayOfMonth();
		//	LocalDate y = currentdate.plusDays(2);
			String x=String.valueOf(clickabledate);
		   
		   if (apptdate.contains(x))
		   {
			   System.out.println("Apptdate" +apptdate );
			   System.out.println("clickabledate" +x );
			   
			   System.out.println("Date Match");
			   
		   }
		   else {
			 
			   System.out.println("else Apptdate" +apptdate );
			   System.out.println("else clickabledate" +x );
			   System.out.println("Date does not match");
		   }
		   
		   back.click();
		   }
		
		
	}
	
	


