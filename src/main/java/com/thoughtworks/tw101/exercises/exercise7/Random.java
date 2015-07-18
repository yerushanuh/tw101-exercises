package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by Yerusha on 2015-07-17.
 */
public class Random {
    private int value;

    public Random() {
        this(0, 0);
    }

    public Random(int min, int max) {
        this.value = min + (int)(Math.random() * ((max - min) + 1));
    }

    public int getValue() {
        return this.value;
    }
}
