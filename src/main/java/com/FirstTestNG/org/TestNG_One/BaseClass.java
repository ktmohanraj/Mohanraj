package com.FirstTestNG.org.TestNG_One;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
	public static WebDriver driver; 
	
	
	public static WebDriver setbrowser(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));
				driver = new ChromeDriver();
			}
			else if (browsername.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));
				driver = new EdgeDriver();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void getUrl(String value) {
		try {
			driver.get(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void sendkey(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void currenturl() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void title() {
		driver.getTitle();
		}
	
	public static void naviTo(String value) {
		try {
			driver.navigate().to(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void naviBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void naviForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void refresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void conClick(WebElement element, String value) {
		
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();
		
	}
	
	public static void sClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).perform();
	}
	
	public static void dClick(WebElement element, String value) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}
	
	public static void movetoElement(WebElement element, String value) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public static void dandd(WebElement element, String value) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element, element);
	}
	public static void frameStr(WebElement element) {
		driver.switchTo().frame(element);
		driver.switchTo().defaultContent();
		
	}
	
	public static void frameInt(WebElement element) {
		driver.switchTo().frame(element);
		driver.switchTo().defaultContent();
	}
	
	public static void frameele(WebElement element) {
		driver.switchTo().frame(element);
		driver.switchTo().defaultContent();
	}
	
	public static void robotKeyPress(WebElement element) throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	}
	
	public static void robotKeyRel(WebElement element) throws Throwable {
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void robotKeyEnter(WebElement element) throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void alertYes() {
		driver.switchTo().alert().accept();
	}
	
	public static void alertNo() {
		driver.switchTo().alert().dismiss();
	}
	
	public static void screenShot() throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srfile = ts.getScreenshotAs(OutputType.FILE);
		File drfile = new File("C:\\Users\\Asus\\eclipse-workspace\\seleniumproject\\screenshot\\pic\\one.png");
		FileUtils.copyFile(srfile, drfile);
	}
	
	public static void windowHandle(WebElement element) {
		String getname = driver.getWindowHandle();
		driver.switchTo().window(getname).getTitle().equals(getname);
	}
	
	public static void windowHandles() {
		Set<String> alldata = driver.getWindowHandles();
		for (String data: alldata) {
		driver.switchTo().window(data).getTitle();	
		}
	}
	
	public static void sDownIndex(WebElement element, int value) {
		element.click();		
		Select s = new Select(element);
		s.selectByIndex(value);
		//element.click();
		
	}
	
	public static void sDownValue(WebElement element, String value) {
		element.click();
		Select s = new Select(element);
		s.selectByValue(value);
		//element.click();
	}
	
	public static void sDownVisible(WebElement element, String value) {
		element.click();
		Select s = new Select(element);
		s.selectByVisibleText(value);
		element.click();
		
	}
		
	
	
	
	
	
	
	
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void size(WebElement element) {
		element.getSize();
	}
	
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void thread() throws Throwable {
		Thread.sleep(0);
	}
	
	public static void impliwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	
	}
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	

