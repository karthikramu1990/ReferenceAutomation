package com.qa.dt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.dt.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test extends BaseClass {
	
	
		public static void main(String[] args) throws Throwable { 
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("debuggerAddress", "127.0.0.1:1010");
			WebDriver driver = new ChromeDriver(options);
			WebElement findElement = driver.findElement(By.xpath("//button[@class='setup']"));
			findElement.click();
//		 WebElement findElement = driver.findElement(By.xpath("//button[@class='setup']"));      
		}
		
			
		}

