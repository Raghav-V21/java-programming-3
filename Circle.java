package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
class Circle {
    private double radius=1.0;
    private String color="red";
    Circle(){

    }
    Circle(double rad){
        radius=rad;
    }
    public double getRadius(){
        System.out.println("Enter radius:-");
        Scanner sc = new Scanner(System.in);
        radius=sc.nextDouble();
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Circle obj = new Circle();
        System.out.println("Radius="+obj.getRadius());
        System.out.println("Area="+obj.getArea());
    }
}
