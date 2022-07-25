package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Journal {

	
	public Journal() 
	{
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Resource']")
	WebElement resource;
	
	@FindBy(xpath="//android.widget.TextView[@text='Journal']")
	WebElement journal;
	
	@FindBy(xpath="//android.widget.TextView[@text='Stella HFT Journal']")
	WebElement stellaHftJournal;

    @FindBy(xpath="//android.widget.EditText[@text='Type here for anything else you want us to know']")
    WebElement typehere;
    
    @FindBy(xpath="//android.widget.TextView[@text='SAVE']")
    WebElement save;
    
    @FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
    WebElement back;
    
    @FindBy(xpath="//android.widget.TextView[@text='Home']")
WebElement home;    
    public void journal() throws InterruptedException
    {
    	resource.click();
    	journal.click();
    	stellaHftJournal.click();
    	typehere.sendKeys("Test@1230");
    	save.click();
    	
    	back.click();
    	Thread.sleep(1000);
    	back.click();
    	home.click();
    }
    
    public void keyword()
    {
    	resource.click();
    	journal.click();
    	stellaHftJournal.click();
    	typehere.sendKeys("kill");
    	save.click();
    }
}
