package com.mykhailo;

public class ReverseWords {

    public static void main(String[] args) {

        reverseWords("Manipulating Characters in a String");

    }

    public static void reverseWords(String stringOfWords) {
        StringBuilder result = new StringBuilder();
        String[] words = stringOfWords.split("\\s+");
        for (String word : words) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            reverseWord = Character.toUpperCase(reverseWord.charAt(0))
                    + reverseWord.substring(1);
            result.append(reverseWord).append(" ");
        }
        System.out.println(result.toString());
    }
}