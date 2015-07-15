package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int totalAreas = 0;

        for (int i = 0; i < rectangles.length; i++) {
            totalAreas += rectangles[i].area();
        }

        return totalAreas / rectangles.length;
    }
}
