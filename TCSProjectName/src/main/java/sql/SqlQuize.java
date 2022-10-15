package sql;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SqlQuize {
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='w3-button w3-block tut-button'])[4]")
	private WebElement LearnSql;
    
	public SqlQuize(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLearnSqlButton()
	{
		LearnSql.click();
	}
}
