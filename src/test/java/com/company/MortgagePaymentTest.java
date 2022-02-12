package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MortgagePaymentTest {

    @Test
    @DisplayName("Should correctly calculate the monthly payment")
    public void shouldCorrectlyCalculateMortgage() {
        double mp = new MortgagePayment().calculateMortgage(1000, 7, 5);
        Assertions.assertEquals(19.80, mp);
    }

}