package facebooktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebooklogin.FacebookLogin;

public class LoginTestCases {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/login/");
		
		FacebookLogin login = new FacebookLogin(driver);
		login.enterUserName();
		login.enterPassword();
		login.ClickOnLogInButton();
	}

}
