package co.edureka.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Exe Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http:/www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("im@covizmo.com");
		driver.findElement(By.className("qhFLie")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if (at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful for lab 1");
		}
		else
		{
			System.out.println("Test Failure for lab 1");
		}
	}

}
