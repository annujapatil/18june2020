package facebooklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	WebDriver driver;
   @FindBy(xpath="//input[@id='email']")
   private WebElement username;
   
   @FindBy(xpath="//input[@name='pass']")
   private WebElement password;
   
   @FindBy(xpath="//button[text()='Log in']")
   private WebElement loginbutton;
   
   
   public FacebookLogin(WebDriver driver)
   {
	 this.driver=driver; 
	 PageFactory.initElements(driver, this);
   }
   
   public void enterUserName()
   {
	   username.sendKeys("Annuja Patil");  
   }
   public void enterPassword()
   {
	   password.sendKeys("Abhishekpatil");
   }
   public void ClickOnLogInButton()
   {
	   loginbutton.click();
   }
	

}
