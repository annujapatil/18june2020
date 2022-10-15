package amezonproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmezonProject {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement AccountLists;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signinbutton;
	
	public AmezonProject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnAccountandlist()
	{
		AccountLists.click();
	}
	
	public void ClickOnSignInButton()
	{
		signinbutton.click();
	}


}
