package com.FirstTestNG.org.TestNG_One;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	public class Priority {
		
		public static WebDriver driver;
		
				
		@Test
		
		public static void bookMyShow() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\TestNG_One\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://in.bookmyshow.com/explore/home/chennai");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.switchTo().frame("display: none; visibility: hidden;");
			//driver.switchTo().frame("display: none; visibility: hidden;");
			driver.switchTo().frame(0);
			//Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@class='No thanks']")).click();
			System.out.println("Tamil Language");
		}
		public void elanguage() {
			System.out.println("English Language");
		}
		public void hlanguage() {
			System.out.println("Hindi Language");
		}


	}



