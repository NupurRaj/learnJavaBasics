package webDriverBasicsPackage;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest {
  @Test
  public void frameTest1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows8\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Frames.html");
		WebElement frame1= d1.findElement(By.id("singleframe"));
		d1.findElement(By.xpath("//a[@href='#Single']")).click();
		d1.switchTo().frame(frame1);
		d1.findElement(By.xpath("//input[@type='text']")).sendKeys("finally switched to frame");
		d1.switchTo().defaultContent();
		d1.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement frame2 = d1.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		d1.switchTo().frame(frame2);
		WebElement frame3InsideFrame2 = d1.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		d1.switchTo().frame(frame3InsideFrame2);
		d1.findElement(By.xpath("//input[@type='text']")).sendKeys("Hey final I reached to text box, whihc is in nexted frame");
		d1.switchTo().defaultContent();
		d1.findElement(By.xpath("//a[@href='#Single']")).click();
		d1.close();
  }
}
