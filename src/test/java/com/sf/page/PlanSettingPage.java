package com.sf.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Description 审方方案设置页面对象
 * @Author wangmengmeng
 * @Date 2020-07-07 10:23
 */
public class PlanSettingPage {
    @FindBy(xpath = "//button[text()=\"+ 新增审方方案\"]")
    WebElement addBtn;
    @FindBy(xpath = "//button[text()=\"搜索\"]")
    WebElement searchBtn;
    @FindBy(xpath = "//button[text()=\"保存\"]")
    WebElement saveBtn;
    @FindBy(xpath = "//button[text()=\"取消\"]")
    WebElement cancelBtn;


    public void click_addBtn(){
        addBtn.click();
    }

    public void click_searchBtn(){
        searchBtn.click();
    }

    public void click_saveBtn(){
        saveBtn.click();
    }

    public void click_cancelBtn(){
        cancelBtn.click();
    }







}

