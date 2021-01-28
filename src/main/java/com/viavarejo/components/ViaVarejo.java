package com.viavarejo.components;

import org.openqa.selenium.WebDriver;

public class ViaVarejo extends BaseWebComponent {

    public ViaVarejo(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage navigateTo(String url) {
        webDriver.get(url);
        return new HomePage(webDriver);
    }
}
