package webDriverBasicsPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class RegisterationTest {
	
//
//	@BeforeClass
//	  public void beforeClass() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows8\\chromedriver_win32\\chromedriver.exe");
//		WebDriver d1 = new ChromeDriver();
//		d1.get("http://demo.automationtesting.in/Register.html");
//	}
	  
  @Test
  public void registerPageTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows8\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Register.html");
		
		d1.findElement(By.xpath("//input[@type=\"text\" and @placeholder=\"First Name\"]")).sendKeys("Jhon");
		d1.findElement(By.xpath("//input[@type=\"text\" and @placeholder=\"Last Name\"]")).sendKeys("Michale");
		d1.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("1234, \nPalo Alto, \nUS");
		d1.findElement(By.xpath("//input[@type='email']")).sendKeys("jhon.michalle@gmail.com");
		d1.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("1234567890");;
		d1.findElement(By.xpath("//label[text()=\" FeMale\"]//input[@type=\"radio\"]")).click();
		d1.findElement(By.id("checkbox1")).click();
		d1.findElement(By.xpath("//select[@id=\"country\"]//*[text()=\"United States of America\"]")).click();
		d1.findElement(By.xpath("//label[text()=\"Languages\"]/parent::div//ul/li/a[text()=\"English\"]")).click();
		d1.close();

  }
  @BeforeMethod
  public void beforeMethod() {
  }


  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
