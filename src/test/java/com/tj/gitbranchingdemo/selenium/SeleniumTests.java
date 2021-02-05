package com.tj.gitbranchingdemo.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.boot.test.context.SpringBootTest;

import com.tj.gitbranchingdemo.config.SeleniumConfig;

@SpringBootTest
public class SeleniumTests {
	
	SeleniumConfig config;
	WebDriver driver;
	
	@Test
	public void contextLoads() {
		
		System.out.println("---------------------------------Selenium test FIRED!!!--------------------------------");
		
	}
	
	@Before
	public void setUpSelenium() {
		
		config = new SeleniumConfig();
		driver = config.getDriver();
		
		driver.get("http://localhost:8080/");
		
	}
	
	@Test
	public void getCorrectHeaderFromHomePage() {
		
		String expectedHeader = "Hello World";
		String actualHeader = driver.findElement(By.id("header")).getText();
		
		assertEquals("Test failed: Incorrect header.", expectedHeader, actualHeader);
		
	}
	
	@Test
	public void userCanInputTwoNumbersAndGenerateCorrectSumByPressingAdd() {
		
		//Navigate to the calculator page
		driver.get("http://localhost:8080/calculator");
		
		//Define test input
		String testNum1 = "5";
		String testNum2 = "2";
		int expectedResult = Integer.parseInt(testNum1) + Integer.parseInt(testNum2);
		
		//Locate and select the number input fields
		WebElement inputElement1 = driver.findElement(By.id("num-1"));
		WebElement inputElement2 = driver.findElement(By.id("num-2"));
		
		//Have selenium type in the number fields
		inputElement1.sendKeys(testNum1);
		inputElement2.sendKeys(testNum2);
		
		//Click the add button
		WebElement addButton = driver.findElement(By.id("btn-add"));
		addButton.click();
		
		//Read the result
		String actualResultString = driver.findElement(By.id("result")).getText();
		int actualResult = Integer.parseInt(actualResultString);
		
		//Check that returned result = expected result
		assertEquals("Test failed: Result not reached or is incorrect.", expectedResult, actualResult);
		
	}

}

