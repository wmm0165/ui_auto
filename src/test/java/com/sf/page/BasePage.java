package com.sf.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * @Description
 * @Author wangmengmeng
 * @Date 2020-07-07 10:12
 */
public class BasePage {
    public static WebDriver dr;
    private final int TIMEOUT = 10;
    static {
        System.setProperty("webdriver.chrome.driver", "D:\\soft\\chromedriver\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("disable-infobars"); //去掉提示 "Chrome正受到自动测试软件的控制--暂没生效，原因待查"
        dr = new ChromeDriver(option);
        dr.manage().window().maximize();
    }

    public BasePage() {

//        System.setProperty("webdriver.chrome.driver", "D:\\soft\\chromedriver\\chromedriver.exe");
//        ChromeOptions option = new ChromeOptions();
//        option.addArguments("disable-infobars"); //去掉提示 "Chrome正受到自动测试软件的控制--暂没生效，原因待查"
//        this.dr = new ChromeDriver(option);
//        this.dr = dr;
        PageFactory.initElements(new AjaxElementLocatorFactory(dr, TIMEOUT), this);
    }


}
