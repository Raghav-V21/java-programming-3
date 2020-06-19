package com.company;
import java.util.Scanner;
public class Area {
int length, breadth;
    public void setDim(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:-");
        int l = sc.nextInt();
        System.out.println("Enter breadth:-");
        int b = sc.nextInt();
        length=l;
        breadth=b;
    }
    public void getArea(){
        int area=length*breadth;
        System.out.println("Area="+area);
    }
    public static void main(String[] args) {
        Area obj=new Area();
        obj.setDim();
        obj.getArea();
    }
}
