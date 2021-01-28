package com.viavarejo.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseWebComponent {

    private final static String SEARCH_PAGE = "Pesquisa para o profissional da área de Qualidade";

    @FindBy(id = "menu-item-226")
    private WebElement searchQaButton;

    protected HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public SearchPage clickSearchQaButton() {
        click(searchQaButton);
        waitForVisible(webDriver.findElement(By.xpath(String.format("//*[contains(text(), '%s')]", SEARCH_PAGE))));
        return new SearchPage(webDriver);
    }
}
