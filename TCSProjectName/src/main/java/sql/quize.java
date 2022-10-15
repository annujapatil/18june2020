package sql;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class quize {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/quiztest/quiztest.asp?qtest=SQL']")
    private	WebElement StartTheQuize;
	
	public quize(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void StartTheQuize()
	{
		StartTheQuize.click();
	}

}
