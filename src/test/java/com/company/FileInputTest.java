package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

class FileInputTest {

    @Test
    @DisplayName("Should validate the path to and read the file containing customer information")
    public void shouldValidatePath() {
        List<String> result = FileInput.readFile("prospects.txt");
        Assertions.assertNotNull(result);
    }

}