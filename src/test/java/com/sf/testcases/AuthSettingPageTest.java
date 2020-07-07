package com.sf.testcases;

import com.sf.page.HomePage;
import com.sf.page.LoginPage;
import com.sf.page.MenuPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @Description 药师权限设置页面
 * @Author wangmengmeng
 * @Date 2020-07-07 13:46
 */
public class AuthSettingPageTest {


    @BeforeClass
    public void beforeClass() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("auto", "123456");
        HomePage homePage = new HomePage();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homePage.chooseSf();
        MenuPage menuPage = new MenuPage();
        menuPage.chooseAuditSetting();
        menuPage.choosePlanSetting();
    }

    @Test
    public void Demo() {

    }
}
