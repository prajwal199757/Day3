package com.training.org;

public class Circle extends Shape {
    private double area;
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public void getArea()
    {
        area=(3.14)*radius*radius;
        System.out.println(area);
    }
}
