package com.company;
import java.util.Scanner;
public class SumOfDigits {
    public static int add(int num, int sum){
        if(num/10==0)
        {
            return sum+num;
        }
        else {
            sum = sum + num%10;
            return add(num/10,sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int num = sc.nextInt();
        int sum = add(num,0);
        System.out.println("Sum="+sum);
    }
}
