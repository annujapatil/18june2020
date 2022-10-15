package sql;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class quizetestcase {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(1000);
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//WebElement w =driver.findElement(By.xpath("//h1[text()='SQL']"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,2700)");
	
		SqlQuize sq = new SqlQuize(driver);
		sq.ClickOnLearnSqlButton();
		Test t = new Test(driver);
		t.StartSqlQuize();
		quize q = new quize(driver);
		q.StartTheQuize();
		Start s= new Start(driver);
		s.SelectOption();
		s.ClickOnNextButton();
		
	
	}

}
