package com.akb;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegistrationUtilTest {

    private RegistrationUtil registrationUtil;

    @Before
    void setup(){
        registrationUtil = new RegistrationUtil();
    }

    @Test
    void test_password_doesnt_match(){
        boolean actual = registrationUtil.validationUserInput("kissi","test", "teste");
        assertFalse(actual);
    }

    @Test
    void test_all_field_empty(){
        boolean actual = registrationUtil.validationUserInput("", "","");
        assertFalse(actual);
    }

    @Test
    void test_correct_input_fields(){
        boolean actual = registrationUtil.validationUserInput("kissi", "test", "test");
        assertTrue(actual);
    }
}
