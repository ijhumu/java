package com.nstu;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public double getWidth(){
        return width;
    }
    public void setwidth(double width){
        this.width=width;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    double area;
    double getArea( )
    {
        area=(width * height);
        System.out.println("\nArea of the Rectangle: "+ area);
        return area;
    }
    double perimeter;
    double getPerimeter()
    {
        perimeter = 2 * (width+height);
        System.out.println("Perimeter of the Rectangle: "+ perimeter);
        return perimeter;
    }
}
