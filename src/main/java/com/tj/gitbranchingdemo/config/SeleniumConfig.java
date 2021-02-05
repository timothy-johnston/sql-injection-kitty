package com.tj.gitbranchingdemo.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.core.io.ClassPathResource;

public class SeleniumConfig {
	
	
	private WebDriver driver;
	
	public SeleniumConfig() {
		Capabilities capabilities = DesiredCapabilities.firefox();
		driver = new FirefoxDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	static {
//		System.setProperty("webdriver.gecko.driver", "C:\\projects\\env\\GeckoDriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", new ClassPathResource("\\src\\main\\resources\\geckodriver.exe").getPath());
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	

}
