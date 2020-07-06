package com.sf.testcases;

import com.sf.common.sfContant;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @Description
 * @Author wangmengmeng
 * @Date 2020-07-06 17:55
 */
public class DemoTest {
    @Test
    public void testDemo() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\soft\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(sfContant.loginUrl);
        driver.findElementById("name").sendKeys(sfContant.username);
        driver.findElementByCssSelector("div.pwd-ipt>input").sendKeys(sfContant.password);
        driver.findElementByCssSelector("button.login-button").click();
        Thread.sleep(2000);

    }
}

