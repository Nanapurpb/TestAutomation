package com.sgtesting.pageobjectmodel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class pomassignment1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {



		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		 createuser();
		 deleteuser();
		//logout();
		//closeApplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oPage=new ActiTimePages(oBrowser);
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
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void flyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser()
	{
		try
		{
			oPage.getuserbutton().click();
			Thread.sleep(1000);
			oPage.getadduserbutton().click();
			Thread.sleep(1000);
			oPage.getfirstname().sendKeys("Demo");
			oPage.getLasttname().sendKeys("User");
			oPage.getEmail().sendKeys("Demo@gmail.com");
			oPage.getUserName().sendKeys("DemoUser");
			oPage.getPassword1().sendKeys("create");
			oPage.getRetypePassword().sendKeys("create");
			oPage.getcreateuserbutton().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser()
	{
		try
		{
			oPage.getuserNameContainer().click();
			Thread.sleep(1000);
			oPage.getdeleteuserbutton().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

