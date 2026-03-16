package com.workintech.pool;

public class Cuboid extends Rectangle {
    public double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea()* height;
    }
}
