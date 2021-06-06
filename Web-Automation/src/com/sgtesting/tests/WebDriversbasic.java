package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriversbasic {

	public static void main(String[] args) {
		launchBrowser();
	}
		
		static void launchBrowser()
		{
			
			try
			{
		System.getProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		//driver.get("http://localhost:81/login.do");
       // System.out.println(driver.getTitle());
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
