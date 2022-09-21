package com.linearsearch;

public class StringSearch {
    public static void main(String[] args) {
        String name = "rohit";
        char target = 'o';
        boolean result = Search(name, target);
        System.out.println(result);
    }

    static boolean Search(String arr, char target) {
        if (arr.length() == 0) {
            return false;
        }

        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    static boolean Search2(String arr, char target) {
        if (arr.length() == 0) {
            return false;
        }

        for (char ch : arr.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
