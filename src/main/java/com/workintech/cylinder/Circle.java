package com.workintech.cylinder;

import java.util.Locale;

public class Circle {
    private double radius;

    static {
        Locale.setDefault(Locale.US);
    }

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
