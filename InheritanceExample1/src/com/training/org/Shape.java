package com.training.org;

public class Shape {
    private double height;
    private double width;

    public Shape()
    {

    }

    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
