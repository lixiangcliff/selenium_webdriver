package com.testCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchPageTitleTest {
	WebDriver driver;
	@Before
	public void testSetup() {
		driver = new FirefoxDriver();
		driver.get("http://www.indeed.com");
	}
	
	@After
	public void testTearDown() {
		driver.close();
	}
	
	
	@Test
	public void hasSearchPageTitle() {
		driver.findElement(By.id("what")).sendKeys("Selenium");
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("London");
		driver.findElement(By.id("fj")).click();
		String title = driver.getTitle();
		Assert.assertTrue(title.equals("Selenium Jobs, Employment in London, OH | Indeed.com"));
	}
	
}
