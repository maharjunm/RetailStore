package com.retail.tw;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class UserInputTest {

    @Test
    public void shouldReturnTheUserInput() {
        String input = "Maharjun";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);

        Assert.assertEquals(input, userInput.getInput());
    }
}
