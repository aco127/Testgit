package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Keywords {

	AndroidDriver driver;

	public Keywords() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);

	}

	@FindBy(xpath = "//input[@class='ycptinput']")
	WebElement email;

	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	WebElement checkinbox;

	@FindBy(xpath = "//android.widget.TextView[@text='Resource']")
	WebElement resource;

	@FindBy(xpath = "//div[@class='lms' and text()='Resources and Help from MamaLift']")
	WebElement subject;

	@FindBy(xpath = "//android.widget.TextView[@text='My Learnings']")
	WebElement myLearnings;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
	WebElement selectWeek;

	@FindBy(xpath = "//android.widget.TextView[@text='Week 1']")
	WebElement Week1;
	@FindBy(xpath = "//android.widget.TextView[@text='1']")
	WebElement Day1;
	@FindBy(xpath = "//android.widget.TextView[@text='PROCEED']")
	WebElement proceed;

	@FindBy(xpath = "//android.widget.TextView[@text='Reflect']")
	WebElement reflect;

	@FindBy(xpath = "//android.widget.EditText")
	WebElement textarea;
	
	@FindBy(xpath="//android.widget.TextView[@text='FINISH']")
	WebElement finish;

	public void checkEmail() {
		email.sendKeys("june@yopmail.com");
		checkinbox.click();
		driver.switchTo().frame("ifmail");
		System.out.println(subject.getText());

	}

	public void w1d1reflect() {
		resource.click();
		myLearnings.click();
		selectWeek.click();
		Week1.click();
		Day1.click();
		proceed.click();
		reflect.click();
		textarea.sendKeys("Suicide");
		finish.click();
	}

}
