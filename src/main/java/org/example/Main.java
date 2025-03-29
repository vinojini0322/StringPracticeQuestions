package org.example;

public class Main {
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
        for (int i = 0; i < k-1; i++) {
            truncated.append(words[i]).append(" ");
        }
        truncated.append(words[k-1]);
        return truncated.toString();
    }

}