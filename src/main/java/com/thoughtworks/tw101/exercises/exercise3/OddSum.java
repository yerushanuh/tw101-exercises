package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
    private static final int EVEN_DIVISOR = 2;
    private int sum;

    public OddSum() {
        this.sum = 0;
    }

    public int of(int start, int end) {
        int firstOdd;

        if (start % EVEN_DIVISOR == 0) {
            firstOdd = start + 1;
        }
        else {
            firstOdd = start;
        }

        for (int odd = firstOdd; odd <= end; odd = odd + EVEN_DIVISOR) {
            this.sum += odd;
        }

        return this.sum;
    }
}
