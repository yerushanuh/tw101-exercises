package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.
// By: Yerusha Nuh

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int EVEN_DIVISOR = 2;
    private static final int BOUND_LOWER = 1;
    private static final int BOUND_UPPER = 100;
    private static final String STR_ODD = "Odd numbers from 1 to 100: ";
    private static final String STR_SUM = "Sum of odd numbers: ";

    public static void main(String[] args) {
        List list = new ArrayList();
        int sum = 0;

        list = getOddNumbers(BOUND_LOWER, BOUND_UPPER);
        sum = getSum(list);

        System.out.print(STR_ODD);
        System.out.println(list);

        System.out.print(STR_SUM);
        System.out.println(sum);
    }

    public static List getOddNumbers(int boundLower, int boundUpper) {
        List list = new ArrayList();
        int firstOdd;

        if (boundLower % EVEN_DIVISOR == 0) {
            firstOdd = boundLower + 1;
        }
        else {
            firstOdd = boundLower;
        }

        for (int odd = firstOdd; odd <= boundUpper; odd = odd + EVEN_DIVISOR) {
            list.add(odd);
        }

        return list;
    }

    public static int getSum(List list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += (int)list.get(i);
        }

        return sum;
    }
}
