// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Circle.java

package mte2.shapes;
import java.util.*;
// public class Circle {
public class Circle implements Shape {
    private final double radius;
    public Circle(double radius) {this.radius = radius;}
    @Override
    public double perimeter(){
        return Math.PI*2*radius;
    }
    @Override
    public double area(){
        return Math.pow(Math.PI*radius,2);
    }

    public static void main(String[] args) {
        
        // ...

    }
}