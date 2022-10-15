package sql;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Start {
	WebDriver driver;
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option1;
	
	@FindBy(xpath="//button[text()='Next ❯']")
	private WebElement NextButton;
	
	@FindBy(xpath="//label[@id='label3']")
	private WebElement option2;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option3;
	
	@FindBy(xpath="//label[@id='label2']")
	private WebElement option4;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option5;
	
	@FindBy(xpath="//label[@id='label2']")
	private WebElement option6;
	
	@FindBy(xpath="//label[@id='label3']")
	private WebElement option7;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option8;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option9;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option10;
	
	@FindBy(xpath="//label[@id='label2']")
	private WebElement option11;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option12;
	
	@FindBy(xpath="//label[@id='label3']")
	private WebElement option13;
	
	@FindBy(xpath="//label[@id='label3']")
	private WebElement option14;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option15;
	
	@FindBy(xpath="//label[@id='label2']")
	private WebElement option16;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option17;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option18;
	
	@FindBy(xpath="//label[@id='label3']")
	private WebElement option19;
	
	@FindBy(xpath="//label[@id='label4']")
	private WebElement option20;
	
	@FindBy(xpath="//label[@id='label2']")
	private WebElement option21;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option22;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option23;
	
	@FindBy(xpath="//label[@id='label1']")
	private WebElement option24;
	
	@FindBy(xpath="//label[@id='label3']")
	private WebElement option25;
	
	public Start(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SelectOption()
	{
		option1.click();
		option2.click();
		option3.click();
		option4.click();
		option5.click();
		option6.click();
		option7.click();
		option8.click();
		option9.click();
		option10.click();
		option11.click();
		option12.click();
		option13.click();
		option14.click();
		option15.click();
		option16.click();
		option17.click();
		option18.click();
		option19.click();
		option20.click();
		option21.click();
		option22.click();
		option23.click();
		option24.click();
		option25.click();
		
	}
	
	public void ClickOnNextButton()
	{
		NextButton.click();
	}
	
	

}
