package com.viavarejo.components;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseWebComponent {

    protected static WebDriver webDriver;
    private final long defaultTimeOut;

    protected BaseWebComponent(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        defaultTimeOut = 30;
    }

    protected void waitForVisible(WebElement element) {
        new WebDriverWait(webDriver, defaultTimeOut)
                .until(ExpectedConditions.visibilityOf(element));
    }

    protected void sendKeys(WebElement element, CharSequence keys) {
        element.sendKeys(keys);
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected void selectDropdown(WebElement element, String value) {
        Select elements = new Select(element);
        elements.selectByValue(value);
    }

    protected WebElement findElementBy(WebDriver element, By by) {
        return element.findElement(by);
    }
}
