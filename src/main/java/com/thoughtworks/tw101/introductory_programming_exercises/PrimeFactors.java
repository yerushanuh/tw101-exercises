package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
    }

    private static List<Integer> generate(int n) {
        if (n == 1) {
            return null;
        }

        List<Integer> factors = new ArrayList<>();
        List<Integer> primeList = getPrimesLessThan(n);

        for (Integer number : primeList) {
            if (n % number == 0) {
                factors.add(number);
            }
        }

        return factors;
    }

    private static List<Integer> getPrimesLessThan(int n) {
        List<Integer> list = new ArrayList<Integer>();
        boolean isPrimeCandidate;

        for (int i = 2; i <= n; i++) {
            isPrimeCandidate = true;

            for (int j = 2; j < i && isPrimeCandidate; j++) {
                if (i % j == 0) {
                    isPrimeCandidate = false;
                }
            }

            if (isPrimeCandidate) {
                list.add(i);
            }
        }

        return list;
    }
}
