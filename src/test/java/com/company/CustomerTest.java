package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    @DisplayName("Should create an Instance of the class Customer")
    public void shouldCreateCustomer() {
        new Customer("John Doe", 1000, 7, 5);
        Assertions.assertTrue(true);
    }

}