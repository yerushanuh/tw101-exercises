package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Yerusha on 2015-07-15.
 */
public class Troll implements Monster {
    private static final String NAME = "Troll";
    private static final int INITIAL_HITPOINTS = 40;
    private static final int DAMAGE_REDUCER = 2;
    private int currentHitpoints;

    public Troll() {
        this.currentHitpoints = INITIAL_HITPOINTS;
    }

    public void takeDamage(int amount) {
        this.currentHitpoints -= amount / DAMAGE_REDUCER;
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
