package com.viavarejo.data;

import org.testng.annotations.DataProvider;

import static com.viavarejo.components.DropdownAgeOption.LAST_THEN_FIVE;
import static com.viavarejo.components.DropdownFollowingDomainOption.*;
import static com.viavarejo.components.RadioOption.*;

public class DataDriven {

    @DataProvider(name = DataDrivenProvider.VALID_FORM)
    protected Object[][] validCredentials() {
        return new Object[][]{
                {
                        "Tauan",
                        "Marinho",
                        "tauamarinho@gmail.com",
                        FIRST,
                        LAST_THEN_FIVE,
                        CHALLENGE,
                        SECOND,
                        "Java",
                }
        };
    }
}
