package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CareConcerns {

	
	public CareConcerns() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Care concerns']")
	WebElement careconcern;
	
	@FindBy(xpath="//android.widget.TextView[@text='stress management']")
	WebElement stressmanagement;
	
	@FindBy(xpath="//android.widget.TextView[@text='Resource']")
	WebElement resource;
	
	public void checkcareconcern()
	{
		resource.click();
		careconcern.click();
		stressmanagement.click();
		
	}
	
	
}
