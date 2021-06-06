package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePages {

	public ActiTimePages(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Create WebElement for UserName text field
	private WebElement username;

	public WebElement getUserName()
	{
		return username;
	}

	//Create WebElement for Password Text Field
	private WebElement pwd;

	public WebElement getPassword()
	{
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oBtnLogin;

	public WebElement getLoginButton()
	{
		return oBtnLogin;
	}

	//Create WebElement for FlyOutWindow 
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Create WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLnkLogout;
	public WebElement getLogoutLink()
	{
		return oLnkLogout;
	}
	/////////////////////////////////////////////////////////////////////////////////////////
	//create webelement for userbutton
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oBtnUser;
	public WebElement getuserbutton()
	{
		return  oBtnUser;
	}
	//create webelement for adduserbutton
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement oBtnaddUser;
	public WebElement getadduserbutton()
	{
		return  oBtnaddUser;
	}
	//	create webelement for FirstName
	private WebElement firstName;

	public WebElement getfirstname()
	{
		return  firstName;
	}

	// create webelement for LasttName
	private WebElement  lastName;

	public WebElement getLasttname()
	{
		return   lastName;
	}

	// create webelement for Email
	private WebElement email;

	public WebElement getEmail()
	{
		return   email;
	}


	// create webelement for Password1
	private WebElement password;

	public WebElement getPassword1()
	{
		return  password;
	}

	// create webelement for Retype Password
	private WebElement passwordCopy;

	public WebElement getRetypePassword()
	{
		return  passwordCopy;
	}

	//create webelement for createuserbutton
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement  createuserbutton;
	public WebElement  getcreateuserbutton()
	{
		return   createuserbutton;
	}		

	////create webelement for createduserbutton
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement  userNameContainer;
	public WebElement  getuserNameContainer()
	{
		return  userNameContainer;
	}		

	////create webelement for deleteduserbutton
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement  deleteuserbutton;
	public WebElement   getdeleteuserbutton()
	{
		return    deleteuserbutton;
	}	




























}

