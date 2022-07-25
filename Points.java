package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import Utils.PointExcel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Points {
	
	AndroidDriver driver;

	public Points() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);

	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Points']")
	static WebElement points;

	@FindBy(xpath="//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
	static WebElement getpoints;
	
	public static void checkpoints() throws IOException
	{
		
		points.click();
		String point= getpoints.getText();
		int number = Integer.parseInt(point);
		  System.out.println("Points is no " +number);
		
		  PointExcel.writetosheet(point, 3, "Sheet1");
		  
		  AppDriver.getDriver().navigate().back();
	}
}
