package com.viavarejo.components;

import org.openqa.selenium.WebDriver;

import static java.lang.String.*;
import static org.openqa.selenium.By.*;

public class SuccessfulSearchPage extends BaseWebComponent {

    private final static String RESEARCH_DONE = "Pesquisa para o profissional da área de Qualidade:";
    private final static String FORM_SUBMITTED = "Your form has been successfully submitted.";

    protected SuccessfulSearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SuccessfulSearchPage validateFormSent() {
        waitForVisible(findElementBy(webDriver, xpath(format("//*[contains(text(), '%s')]", RESEARCH_DONE))));
        waitForVisible(findElementBy(webDriver, xpath(format("//*[contains(text(), '%s')]", FORM_SUBMITTED))));
        return this;
    }
}
