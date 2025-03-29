package org.example;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
    }

    //    Leetcode 125
    private static boolean isPalindrome(String word) {
        word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //   Leetcode 1662
    private boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String s : word1) {
            s1.append(s.toLowerCase());
        }
        for (String s : word2) {
            s2.append(s.toLowerCase());
        }
        return s1.compareTo(s2) == 0;
    }

// Leetcode 1816

    private static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder truncated = new StringBuilder();
        for (int i = 0; i <= k - 1; i++) {
            truncated.append(words[i]).append(" ");
        }
        return truncated.toString().trim();
    }

    //    Leetcode 2000
    private static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder reversed = new StringBuilder();
        for (int i = index; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        String a = word.substring(index + 1);
        reversed.append(a);
        return reversed.toString();
    }

    //    Leetcode 557
    private static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                reversedWord.append(word.charAt(word.length() - 1 - i));
            }
            reversed.append(reversedWord).append(" ");
        }
        return reversed.toString().trim();
    }

    // Leetcode 334
    private static char[] reverseString(char[] s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < s.length / 2; i++) {
            reversed.append(s[s.length - 1 - i]);
        }
        return reversed.toString().toCharArray();
    }

    //    Leetcode 917
    private static String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();

        while (start <= end) {
            if (Character.isLetter(s.charAt(start)) && Character.isLetter(s.charAt(end))) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (!Character.isLetter(s.charAt(start))) {
                start++;
            } else {
                end--;
            }
        }
        return String.valueOf(arr);
    }

    //    Leetcode 345
    private static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length();
        char[] arr = s.toCharArray();
        while (start < end) {

            if (vowels.contains(String.valueOf(arr[start])) && vowels.contains(String.valueOf(arr[end]))) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (vowels.contains(String.valueOf(arr[start]))) {
                end--;
            } else {
                start++;
            }
        }
        return Arrays.toString(arr);
    }

    //    Leetcode 151
    private static String reverseWordsInSentence(String s) {
        String[] words = s.split("\\s+");
        int start = 0;
        int end = words.length - 1;
        StringBuilder arr = new StringBuilder();
        while (start < end) {
            arr.append(words[end]).append(" ");

            end--;
        }

        return arr.toString().trim();
    }

}