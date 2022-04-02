package webDriverBasicsPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PopUpAlertTest {
  @Test
  public void popTest1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows8\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Alerts.html");
		d1.findElement(By.xpath("//a[text()=\"Alert with OK \"]")).click();
		d1.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Alert alert = d1.switchTo().alert();
		String alertMsg1 = alert.getText();
		System.out.println("Alert message 1 is: "+alertMsg1);
		alert.accept();
		d1.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		d1.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		String alertMsg2 = alert.getText();
		System.out.println("Alert message 2 is: "+alertMsg2);
		alert.dismiss();
		d1.findElement(By.xpath("//a[@href='#Textbox']")).click();
		d1.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert3 = d1.switchTo().alert();
		String alertMsg3 = alert3.getText();
		System.out.println("Alert message 3 is: "+alertMsg3);
		alert3.sendKeys("");
		Thread.sleep(2500);
		alert3.sendKeys("Finally completed the alert task");
		Thread.sleep(2500);
		d1.close();
  }
}
