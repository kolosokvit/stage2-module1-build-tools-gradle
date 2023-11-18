package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            double number = Double.parseDouble(str);
            return number > 0;
        } catch (NumberFormatException | NullPointerException e) {
            e.printStackTrace();
        }
        return false;
    }
}
