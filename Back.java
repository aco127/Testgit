package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Back {
	
	AndroidDriver driver;

	public Back() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	
	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;
	
	
	public static void goback() throws InterruptedException
	{
		System.out.println("clicked on back");
		back.click();
		Thread.sleep(500);
		System.out.println("clicked on back again");
		back.click();
	}

}
