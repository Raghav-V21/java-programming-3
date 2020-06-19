package com.company;
import java.util.Scanner;
public class Complex {
    int real, img;
Complex(int tempReal, int tempImg)
{
real=tempReal;
img=tempImg;
}
Complex add(Complex C1, Complex C2)
{
    Complex temp = new Complex(0,0);
    temp.real=C1.real+C2.real;
    temp.img=C1.img+C2.img;
    return temp;
}
Complex sub(Complex C1, Complex C2)
{
    Complex temp = new Complex(0,0);
    temp.real=C1.real-C2.real;
    temp.img=C1.img-C2.img;
    return temp;
}
Complex mul(Complex C1, Complex C2)
{
    Complex temp = new Complex(0,0);
    temp.real=C1.real*C2.real;
    temp.img=C1.img*C2.img;
    return temp;
}
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real part of first number:-");
        int a1=sc.nextInt();
        System.out.println("Enter the imaginary part of first number:-");
        int b1=sc.nextInt();
        System.out.println("Enter the real part of second number:-");
        int a2=sc.nextInt();
        System.out.println("Enter the imaginary part of second number:-");
        int b2=sc.nextInt();
        Complex C1= new Complex(a1,b1);
        Complex C2=new Complex(a2,b2);
        Complex C3=new Complex(0,0);
         System.out.println("1st number:- "+C1.real+C1.img+"+i");
         System.out.println("2nd number:- "+C2.real+C2.img+"+i");
         System.out.println("1.Add\n2.Subtract\n3.Multiply");
         int choice=sc.nextInt();
        switch(choice)
         {
             case 1: C3=C3.add(C1,C2);
                 System.out.println(C3.real+C3.img+"+i");
                 break;
             case 2: C3=C3.sub(C1,C2);
                 System.out.println(C3.real+C3.img+"+i");
                 break;
             case 3: C3=C3.mul(C1,C2);
                 System.out.println(C3.real+C3.img+"+i");
                 break;
             default:
                 System.out.println("Wrong input");
         }
    }
}
