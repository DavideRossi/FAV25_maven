package it.fav.mvn;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        String message = "Hello, Maven! This is a longer message to demonstrate abbreviation.";
        System.out.println("Original: " + message);
        System.out.println("Abbreviated: " + abbreviateMessage(message, 20));
    }

    public static String abbreviateMessage(String message, int maxWidth) {
        return StringUtils.abbreviate(message, maxWidth);
    }
}