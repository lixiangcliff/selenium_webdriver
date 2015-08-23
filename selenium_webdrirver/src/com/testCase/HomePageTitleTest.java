package com.testCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageTitleTest {
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
	public void hasHomePageTitle() {
		String title = driver.getTitle();
		Assert.assertTrue(title.equals("Job Search | one search. all jobs. Indeed.com"));
	}
	
}
