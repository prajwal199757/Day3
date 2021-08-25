package com.training.org;

public class Rectangle extends Shape{
    private double area;

    public Rectangle(double height,double width)
    {
        super(height,width);
    }
    public void getArea()
    {
        area=getHeight()*getWidth();
        System.out.println(area);
    }
}
