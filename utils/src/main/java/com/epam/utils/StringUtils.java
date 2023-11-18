package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            double number = Double.parseDouble(str);
            if (str.startsWith("0") && number >= 1) {
                return false;
            }
            return number > 0;
        } catch (NumberFormatException | NullPointerException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPositiveNumber("088"));
    }
}
