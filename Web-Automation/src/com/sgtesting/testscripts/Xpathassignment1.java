package com.sgtesting.testscripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathassignment1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		Login();
	}

	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void Login()
	{
		oBrowser.findElement(By.xpath("//a[text()=['Username']")).sendKeys("admin");
			//oBrowser.findElement(By.xpath("//input")).sendKeys("admin");
			//oBrowser.findElement(By.xpath("//input[2]")).sendKeys("manager");
			//oBrowser.findElement(By.xpath("//input[@value='login']")).click();
	}
	
	

	
	
}
