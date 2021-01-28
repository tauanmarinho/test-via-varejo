package com.viavarejo;

import com.viavarejo.driver.SetupDriver;
import org.openqa.selenium.WebDriver;

public abstract class UiBaseTest {

    private static final String BROWSER = System.getProperty("browser");
    private static final String LOCAL_IP_ADDRESS = System.getProperty("localIpAddress");
    protected static final String BASE_URL = "http://www.lourencodemonaco.com.br/vvtest/";
    protected static WebDriver webDriver;

    public WebDriver loadWebDriver() {
        SetupDriver setupDriver = new SetupDriver(BROWSER, "Linux", "http://" + LOCAL_IP_ADDRESS + ":5555");
        return setupDriver.getDriver();
    }

    public void quitWebDriver(WebDriver webDriver) {
        webDriver.quit();
    }
}
