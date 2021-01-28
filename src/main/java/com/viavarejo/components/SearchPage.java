package com.viavarejo.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.String.*;
import static org.openqa.selenium.By.*;

public class SearchPage extends BaseWebComponent {

    @FindBy(id = "nf-field-5")
    private WebElement nameInput;

    @FindBy(id = "nf-field-6")
    private WebElement surNameInput;

    @FindBy(id = "nf-field-7")
    private WebElement emailInput;

    @FindBy(id = "nf-field-8")
    private WebElement emailConfirmationInput;

    private String radioButtonId = "nf-label-class-field-10-%s";

    @FindBy(id = "nf-field-11")
    private WebElement ageQaDropdown;

    @FindBy(id = "nf-field-12")
    private WebElement followingDomainDropdown;

    private String radioMostNeededButtonId = "nf-label-class-field-13-%s";

    @FindBy(id = "nf-field-14")
    private WebElement LanguageInterestedInput;

    @FindBy(id = "nf-field-16")
    private WebElement submitButton;

    protected SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SearchPage typeName(String name) {
        sendKeys(nameInput, name);
        return this;
    }

    public SearchPage typeSurName(String surName) {
        sendKeys(surNameInput, surName);
        return this;
    }

    public SearchPage typeEmail(String email) {
        sendKeys(emailInput, email);
        return this;
    }

    public SearchPage typeEmailConfirmation(String email) {
        sendKeys(emailConfirmationInput, email);
        return this;
    }

    public SearchPage selectAge(RadioOption radioOption) {
        click(findElementBy(webDriver, id(format(radioButtonId, radioOption.getPosition()))));
        return this;
    }

    public SearchPage selectHowManyYears(DropdownAgeOption dropdownAgeOption) {
        selectDropdown(ageQaDropdown, dropdownAgeOption.getPosition());
        return this;
    }

    public SearchPage selectFollowingDomain(DropdownFollowingDomainOption dropdownFollowingDomainOption) {
        selectDropdown(followingDomainDropdown, dropdownFollowingDomainOption.getPosition());
        return this;
    }

    public SearchPage selectMostNeeded(RadioOption radioOption) {
        click(findElementBy(webDriver, id(format(radioMostNeededButtonId, radioOption.getPosition()))));
        return this;
    }

    public SearchPage typeLanguageInterested(String language) {
        sendKeys(LanguageInterestedInput, language);
        return this;
    }

    public SuccessfulSearchPage clickSubmit() {
        click(submitButton);
        return new SuccessfulSearchPage(webDriver);
    }
}
