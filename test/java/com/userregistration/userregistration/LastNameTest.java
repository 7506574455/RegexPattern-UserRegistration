package com.userregistration.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.*;

/**
 * Parameterized testing for last name
 */
@RunWith(Parameterized.class)
public class LastNameTest {
    private String lastNameTest;
    private boolean expectedResult;

    public LastNameTest(String lastName, boolean expectedResult) {
        this.lastNameTest = lastName;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {"Lalge", true},
                {"More", true},
                {"lanke", false},
                {"lalge", false}
        });
    }

    @Test
    public void givenLastNameAsVar_ShouldReturnTrueOrFalse() {
        try {
            UserRegistration userRegistration = new UserRegistration(lastNameTest);
            userRegistration.validateLastName(lastNameTest);
        } catch (InvalidUserInputException e) {
            Assert.assertEquals(InvalidUserInputException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }
}

