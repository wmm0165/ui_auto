package com.sf.testcases;

import com.sf.common.sfContant;
import com.sf.page.HomePage;
import com.sf.page.LoginPage;
import com.sf.page.MenuPage;
import com.sf.page.PlanSettingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @Description 审方方案设置页面
 * @Author wangmengmeng
 * @Date 2020-07-07 11:47
 */
public class PlanSettingPageTest {

    private PlanSettingPage planSettingPage;

    @BeforeClass
    public void beforeClass() {
        //登录-选择审方-选择审方设置-选择审方方案设置
        LoginPage loginPage = new LoginPage();
        loginPage.login(sfContant.username, sfContant.password);
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
        planSettingPage = new PlanSettingPage();
    }

    @Test
    public void testAddPlan01() {
        planSettingPage.click_addBtn();
//        planSettingPage


    }




}
