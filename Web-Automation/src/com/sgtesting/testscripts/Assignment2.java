package com.sgtesting.testscripts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		 navigate();
		 login();
		 minimizeFlyOutWindow();
		 createUser();
		 modifyUser();
		 deleteUsers();
		 logout();
		 closeApplication();
		 
	}
	static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
		 obrowser.manage().window().maximize();
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	static void navigate()
	{
		try
		{
			obrowser.get("http://localhost:81/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo1");
			obrowser.findElement(By.name("lastName")).sendKeys("User");
            obrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("demo1User1");
			obrowser.findElement(By.name("password")).sendKeys("create");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("create");
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			
			obrowser.findElement(By.name("firstName")).sendKeys("demo111");
			obrowser.findElement(By.name("lastName")).sendKeys("User");
            obrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("demo111User");
			obrowser.findElement(By.name("password")).sendKeys("create");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("create");
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUsers()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			obrowser.findElement(By.xpath("//*[@id=\\'userListTableContainer\\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=obrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\\'userListTableContainer\\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert1=obrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			obrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			obrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
