package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Yerusha on 2015-07-15.
 */
public interface Monster {
    public abstract void takeDamage(int amount);
    public abstract String name();
    public abstract int currentHitpoints();
    public abstract void reportStatus();
}
