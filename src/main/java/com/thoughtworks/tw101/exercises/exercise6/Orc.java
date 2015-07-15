package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Yerusha on 2015-07-15.
 */
public class Orc implements Monster {
    private static final String NAME = "Orc";
    private static final int INITIAL_HITPOINTS = 20;
    private int currentHitpoints;

    public Orc() {
        this.currentHitpoints = INITIAL_HITPOINTS;
    }

    public void takeDamage(int amount) {
        this.currentHitpoints -= amount;
    }

    public String name() {
        return this.NAME;
    }

    public int currentHitpoints() {
        return this.currentHitpoints;
    }

    public void reportStatus() {
        System.out.print("Name: " + this.NAME);
        System.out.println(", hit points: " + this.currentHitpoints());
    }
}
