package com.tw;

import java.util.Arrays;

public class StringCalculator {

    public int add(String string) {
        if (string.isEmpty()) {
            return 0;
        }

        String separator = ",";

        if (string.startsWith("//")) {
            separator = string.substring(2, 3);
            string = string.substring(4);
        }

        String[] numbers = string.split("[" + separator + "\n]");

        return Arrays.stream(numbers)
                .mapToInt(s -> Integer.parseInt(s))
                .sum();
    }
}
