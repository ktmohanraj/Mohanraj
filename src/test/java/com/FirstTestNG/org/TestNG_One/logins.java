package com.FirstTestNG.org.TestNG_One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class logins {
	@Test
	public void login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\seleniumproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement click = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		click.click();
		
	}
	

}
