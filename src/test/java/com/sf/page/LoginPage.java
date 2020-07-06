package com.sf.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    public WebDriver webDriver;
    @FindBy
    public WebElement userName;

    public void login(){
        userName.sendKeys("admin");
    }

}
