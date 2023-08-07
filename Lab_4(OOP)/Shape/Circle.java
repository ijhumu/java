package com.nstu;

public class Circle extends Shape{

    private double radius=0.0;

    public double getRadius(){
        return radius;
    }
    public void setRaduis(double radius){
        this.radius=radius;
    }
    double area;
    double getArea()
    {
        area = 3.1416 * radius * radius;
        System.out.println("\nArea of the circle: "+ area);
        return area;
    }
    double perimeter;
    double getPerimeter()
    {
        perimeter = 2 * 3.1416 * radius;
        System.out.println("Perimeter of the circle: "+ perimeter);
        return perimeter;
    }

    public Circle ()
    {

    }
    public Circle(double radius,String color)
    {
        System.out.println("\nCircle :");
        System.out.println("Radius : "+radius+"\nColor : "+color);
    }
}
