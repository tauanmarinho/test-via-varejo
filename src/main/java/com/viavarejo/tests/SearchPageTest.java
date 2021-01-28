package com.viavarejo.tests;

import com.viavarejo.UiBaseTest;
import com.viavarejo.components.*;
import com.viavarejo.data.DataDriven;
import org.testng.annotations.*;

import static com.viavarejo.data.DataDrivenProvider.*;

public class SearchPageTest extends UiBaseTest {

    private HomePage viaVarejoHomePage;

    @BeforeClass
    private void navigateLogin() {
        webDriver = loadWebDriver();
        viaVarejoHomePage = new ViaVarejo(webDriver)
                .navigateTo(BASE_URL);
    }

    @AfterClass
    private void quit() {
        quitWebDriver(webDriver);
    }

    @Test(priority = 1,
            description = "Validate form page Via Varejo",
            dataProvider = VALID_FORM,
            dataProviderClass = DataDriven.class)
    public void formSearchPageTest(String name, String surName, String email, RadioOption age, DropdownAgeOption howManyYears,
                          DropdownFollowingDomainOption dropdownFollowingDomainOption, RadioOption mostNeeded, String language) {
        viaVarejoHomePage
            .clickSearchQaButton()
            .typeName(name)
            .typeSurName(surName)
            .typeEmail(email)
            .typeEmailConfirmation(email)
            .selectAge(age)
            .selectHowManyYears(howManyYears)
            .selectFollowingDomain(dropdownFollowingDomainOption)
            .selectMostNeeded(mostNeeded)
            .typeLanguageInterested(language)
            .clickSubmit()
            .validateFormSent();
    }
}
