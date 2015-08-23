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
public class LocatingStrategies {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//firefox
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.indeed.com");
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		//driver.findElement(By.linkText("Upload your resume")).click();		//driver.close();
		//driver.findElement(By.partialLinkText("Post Job")).click();		//driver.close();
		
		//String img_src = driver.findElement(By.xpath("//img[@title='Indeed job search']")).getAttribute("src");
		//System.out.println(img_src);
		
		//String css_value = driver.findElement(By.cssSelector("input.input_submit")).getAttribute("value");
		//System.out.println(css_value);
		
		//int size = driver.findElements(By.tagName("a")).size();
		//System.out.println(size);
		
		//String text = driver.findElement(By.tagName("a")).getText();
		//System.out.println(text);
		
		int size = driver.findElements(By.className("input_text")).size();
		System.out.println(size);
		
		driver.findElement(By.className("input_text")).sendKeys("Selenium");
		

	}

}
