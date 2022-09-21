package com.linearsearch;

public class EvenNumber {
    private static String num;

    public static void main(String[] args) {
//        int[] arr = {424, 55, 33, 232, 545, 32534, 324, 433};
        int[] arr = {-77,-46};
        System.out.println("First method result is " +EvenCheck(arr) + " and second method result is "+ EvenCheck2(arr));
    }

    static int EvenCheck(int[] arr) {
        int count = 0;
        int evennum = 0;
        for (int elm : arr) {
            while (elm != 0) {
                elm = elm / 10;
                ++count;
            }
            if (count % 2 == 0) {
                evennum++;
            }
            count = 0;
        }
        return evennum;
    }

    static int EvenCheck2(int[] arr) {
        int even = 0;
        for (int element : arr) {
            if (element<0){
                element = element*-1;
            }
            String num = element + "";
            if (num.length() % 2 == 0) {
                even++;
            }
        }
        return even;
    }


}
