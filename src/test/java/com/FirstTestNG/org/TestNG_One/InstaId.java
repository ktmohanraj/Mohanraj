package com.FirstTestNG.org.TestNG_One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstaId {
	@Test
	public void loginID() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipse-workspace\\seleniumproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.instagram.com/");
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("mohanraj");
		WebElement pas = driver.findElement(By.id("pass"));
		pas.sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.clear();
		driver.findElement(By.cssSelector("input[type='text'][name='email'][id='email']")).sendKeys("mohanraj");
		driver.findElement(By.cssSelector("input[type='password'][name='pass'][id='pass']")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text'][name='email'][id='email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password'][name='pass'][id='pass']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name^='em']")).sendKeys("Mohanraj");
		driver.findElement(By.cssSelector("input[name$='ss']")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name^='em']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name$='ss']")).clear();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
			//ctrl+2+l			
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String tit = driver.getTitle();
		System.out.println(tit);
		
		
		Thread.sleep(3000);
		//xpath
		WebElement in = driver.findElement(By.xpath("//input[@name='username']"));
		in.sendKeys("978524561555");
		Thread.sleep(3000);
		WebElement in1 = driver.findElement(By.xpath("(//input[@aria-required='true'])[2]"));
		in1.sendKeys("12454564345");
		
		WebElement par = driver.findElement(By.xpath("(//div[contains(@class,'             qF0y9          Igw0E')])[4]"));
		par.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		
		//driver.close();
		
		
		
		
		
		
		
		
		
				
	}

}
