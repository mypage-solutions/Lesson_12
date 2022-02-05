package com.mykhailo;

import java.util.Locale;

public class ReverseWords {

    public static void main(String[] args) {

        System.out.println(reverseWords("Manipulating Characters in a String"));

    }

    public static String reverseWords(String stringOfWords) {
        StringBuilder result = new StringBuilder();
        String[] words = stringOfWords.split("\\s+");
        for (String word : words) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            reverseWord = reverseWord.substring(0, 1).toUpperCase()
                    + reverseWord.substring(1);
            result.append(reverseWord).append(" ");
        }
        return result.toString().trim();
    }
}