package com.sf.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Description 用户登录后展示各业务系统的页面
 * @Author wangmengmeng
 * @Date 2020-07-07 10:23
 */
public class HomePage extends BasePage {
    @FindBy(css = "div:nth-of-type(6)")
    public WebElement auditcenter;

//    public HomePage(WebDriver dr) {
//        super(dr);
//    }

    public void chooseSf() {
        auditcenter.click();
    }

}
