package org.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gotoWebPage {
    @Test
    public void gotoWebD() {
        System.setProperty("webdriver.chrome.driver", "webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Click-Buttons/index.html");
    }
}
