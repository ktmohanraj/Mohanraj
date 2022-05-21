package com.FirstTestNG.org.TestNG_One;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot1 {
	
	@Test
	public void youtube() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\seleniumproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sfile = ts.getScreenshotAs(OutputType.FILE);
		File dfile = new File("C:\\Users\\Asus\\eclipse-workspace\\TestNG\\Screenshot\\pics\\youtubepic.png");
		FileUtils.copyFile(sfile, dfile);
		
	}

}
