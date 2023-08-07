package com.nstu;

public class shapeTast {

    public static void main(String[] args) {


        Rectangle r=new Rectangle();
        r.setwidth(10);
        r.setHeight(20);
        r.setColor("Blue");
        r.getArea();
        r.getPerimeter();


        Circle c=new Circle();
        c.setRaduis(10);
        c.getArea();
        c.getPerimeter();
        Circle c1=new Circle(10,"Red");

    }
}
