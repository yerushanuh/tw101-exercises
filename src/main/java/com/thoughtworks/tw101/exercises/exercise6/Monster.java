package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Yerusha on 2015-07-15.
 */
public interface Monster {
    public void takeDamage(int amount);
    public String name();
    public int currentHitpoints();
    public void reportStatus();
}
