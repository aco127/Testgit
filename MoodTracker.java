package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import Utils.PointExcel;
import Utils.Scroll;
import Utils.WriteExcel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MoodTracker {
	

	AndroidDriver driver;

	public MoodTracker() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);

	}

@FindBy(xpath="//android.widget.TextView[@text='What is your mood today?']")
WebElement mood;

@FindBy(xpath="//android.widget.TextView[@text='Awesome']")
WebElement Awesome;


@FindBy(xpath="//android.widget.TextView[@text='Great']")
WebElement Great;

@FindBy(xpath="//android.widget.TextView[@text='Ok']")
WebElement Okmood;
@FindBy(xpath="//android.widget.TextView[@text='Bad']")
WebElement Bad;

@FindBy(xpath="//android.widget.TextView[@text='Terrible']")
WebElement Terrible;

@FindBy(xpath="//android.widget.TextView[@text='NEXT']")
WebElement Next;

@FindBy(xpath="//android.widget.Button[@text='OK']")
WebElement ok;

@FindBy(xpath="//android.widget.TextView[@text='FINISH']")
WebElement finish;

@FindBy(xpath = "//android.widget.TextView[@text='Resource']")
WebElement resource;

@FindBy(xpath = "//android.widget.TextView[@text='Report']")
WebElement report;

@FindBy(xpath="//android.widget.TextView[@text='Points']")
WebElement points;

@FindBy(xpath="//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
WebElement getpoints;

@FindBy(id = "android:id/message")
WebElement message;

@FindBy(id="android:id/button1")
WebElement okbtn;


public void checkmoodpopup() throws InterruptedException
{
	
	Next.click();
	Thread.sleep(2000);
	okbtn.click();
}

public void mood() throws InterruptedException
{
	Thread.sleep(1000);
	mood.click();
	Great.click();
	Next.click();
	try {
		String actualText = message.getText();
		if (actualText.contains("100")) {
			System.out.println("Validation of 100 Points received Successful on Mood Data");
		}
		ok.click();
	}
	catch(Exception e)
	{
	//	e.printStackTrace();
	}
	Thread.sleep(1500);
	finish.click();
	//resource.click();
	//report.click();
	//Scroll.scrollIntoViewn("Weekly Mood Report");
	
}

public void checkpoints() throws Exception
{
	points.click();
	  String point= getpoints.getText();
	  int number = Integer.parseInt(point);
	  System.out.println("Mood Points is " +point);
	//  Thread.sleep(1000);
	
	  PointExcel.writetosheet(point, 2, "Sheet1");
	  
	 // Scroll.Takess();
	  AppDriver.getDriver().navigate().back();	
}

}
