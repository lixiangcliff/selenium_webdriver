package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


/**
 * https://www.youtube.com/watch?v=-eJ2cZXyJ0E
 * @author cliff
 *
 */
public class indeedJobSearch {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//firefox
		//WebDriver driver = new FirefoxDriver();
		
		//chrome
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\cliff\\git\\selenium_webdriver\\selenium_webdrirver\\browser_driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\cliff\\git\\selenium_webdriver\\selenium_webdrirver\\browser_driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		
		
		driver.get("http://www.indeed.com");
		Thread.sleep(2000);
		driver.findElement(By.id("what")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("where")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("where")).sendKeys("London");
		Thread.sleep(2000);
		driver.findElement(By.id("fj")).click();
		
		String title = driver.getTitle();
		String searchCount = driver.findElement(By.id("searchCount")).getText();
		
		System.out.println(title);
		System.out.println(searchCount);
		
		driver.close();
		
	}

}
