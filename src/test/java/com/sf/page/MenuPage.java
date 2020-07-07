package com.sf.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Description 审方系统的菜单
 * @Author wangmengmeng
 * @Date 2020-07-07 14:33
 */
public class MenuPage extends BasePage {
    @FindBy(css = "li:nth-of-type(5) span.menu-text")
    public WebElement auditSetting;
    @FindBy(css = "li:nth-of-type(5) li:nth-of-type(1)>span")
    public WebElement planSetting;


//    public MenuPage(WebDriver dr) {
//        super(dr);
//    }

    public void chooseAuditSetting() {
        auditSetting.click();
    }
    public void choosePlanSetting() {
        planSetting.click();
    }
}
