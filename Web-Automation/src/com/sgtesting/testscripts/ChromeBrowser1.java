package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser1 {
public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		 minimizeFlyOutWindow();
		createcustomer();
		deletecustomer();
		createproject();
		createtask();
		deletetask();
		deleteproject();
		logout();
		//closeApplication();
		
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
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		static void createcustomer()
		{
			try
			{
				obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
				Thread.sleep(5000);
				obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
				obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(5000);
				obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("prjagveeeennna");
				Thread.sleep(2000);
				obrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div")).click();
				Thread.sleep(6000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deletecustomer()
		{
			try
			{
				obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
				Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
				Thread.sleep(1000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
		static void createproject()
		{
			try
			{
			obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("demoproject");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'ext-gen68\']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("projectPopup_newCustomerNameField")).sendKeys("praveen");
			obrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']")).click();
			Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void deleteproject()
		{
			try
			{
			obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click(); 
		    Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div\r\n")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void createtask()
		{
			try
			{
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='ext-gen152']/div[13]/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("task1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div/span")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='ext-gen152']/div[13]/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("task2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div/span")).click();
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deletetask()
		{
			try
			{
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[1]/div/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[3]/div/div/div[4]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='deleteTaskPopup_deleteConfirm_submitBtn']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[1]/div/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[3]/div/div/div[4]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='deleteTaskPopup_deleteConfirm_submitBtn']")).click();
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


