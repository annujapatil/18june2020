package sql;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test {
	WebDriver driver;
	@FindBy(xpath="//a[@class='w3-blue w3-button w3-round']")
	private WebElement startSqlQuize;
	
	public Test(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void StartSqlQuize()
	{
		startSqlQuize.click();
	}

}
