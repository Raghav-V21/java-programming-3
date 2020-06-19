package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num, sum = 0, rem;
        int digits=0;
        while(temp!=0)
        {
            temp=temp/10;
            digits++;
        }
        temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            sum+=Math.pow(rem,digits);
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println("Number is armstrong number");
        }
        else{
            System.out.println("Number is not an armstrong number");
        }
    }
}
