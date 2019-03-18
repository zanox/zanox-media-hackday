package com.devday.business;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class LogicTest {

    @Test
    public void testGenerateValuePositive() {
        assertThat(new Logic().generateValue(true), Matchers.greaterThanOrEqualTo(0));
    }

    @Test
    public void testGenerateValueNegative() {
        assertThat(new Logic().generateValue(false), Matchers.lessThan(0));
    }

}
