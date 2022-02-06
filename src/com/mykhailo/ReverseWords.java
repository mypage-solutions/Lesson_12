package com.mykhailo;

import java.util.Locale;

public class ReverseWords {

    public static void main(String[] args) {

        System.out.println(reverseWords("Manipulating Characters in a String"));

    }

    public static String reverseWords(String sequenceOfWords) {
        if (sequenceOfWords == null || sequenceOfWords.isEmpty()) {
            return sequenceOfWords;
        }
        String[] words = sequenceOfWords.split("\\s+");
        StringBuilder result = new StringBuilder();
        String temp;
        for (String word : words) {
            temp = word.substring(0, word.length() - 1) + word.substring(word.length() - 1).toUpperCase();
            temp = new StringBuilder(temp).reverse().toString();
            result.append(temp).append(" ");
        }
        return result.toString().trim();
    }
}