package com.sf.page;

import com.sf.common.sfContant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import sun.net.util.IPAddressUtil;

public class LoginPage extends BasePage {

    @FindBy(id = "name")
    public WebElement userName;

    @FindBy(css = "div.pwd-ipt>input")
    public WebElement passWord;

    @FindBy(css = "button.login-button")
    public WebElement loginBtn;

//    public LoginPage(WebDriver dr) {
//        super(dr);
//    }


    public void login(String username,String password) {
        dr.get(sfContant.loginUrl);
        input_username(username);
        input_password(password);
        click_login();

    }

    public void input_username(String username) {
        userName.sendKeys(username);
    }

    public void input_password(String password) {
        passWord.sendKeys(password);
    }

    public void click_login() {
        loginBtn.click();
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\soft\\chromedriver\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("disable-infobars"); //去掉提示 "Chrome正受到自动测试软件的控制--暂没生效，原因待查"
        WebDriver dr = new ChromeDriver(option);
//        LoginPage lg = new LoginPage(dr);
//        lg.login("auto","123456");
    }

}
