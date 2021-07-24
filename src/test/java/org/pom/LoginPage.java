package org.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobalCommon{
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id="login")
	private WebElement btnLogin;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void Login(String username,String password) {
		type(getTxtUserName(),username);
		type(getTxtpassword(), password);
		click(getBtnLogin());
	}
	
	}


