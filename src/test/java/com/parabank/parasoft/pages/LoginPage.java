package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage fillUsername(String username){
        getWebElement(By.cssSelector("input[name='username']")).sendKeys(username);
        return this;
    }
    public LoginPage fillPassword(String password){
        getWebElement(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;
    }
    public AccountOverviewPage clickLoginBtn(){
        getWebElement((By.cssSelector("input[value='Log In']"))).click();
        return getInstance(AccountOverviewPage.class);

    }

    public LoginPage clickLoginLinkBtn(){
        getWebElement((By.cssSelector("input[value='Log In']"))).click();
        return this;
    }
    public CustomerLookupPage clickForgetLink(){
        getWebElement((By.cssSelector("a[href='lookup.htm']"))).click();
        return getInstance(CustomerLookupPage.class);
    }
    public RegisterPage clickRegistration(){
        getWebElement(By.cssSelector("a[href='register.htm']")).click();
        return getInstance(RegisterPage.class);
    }
    public boolean hasError(){
        return getWebElements(By.ByClassName.className("error")).size() >0;
    }
}
