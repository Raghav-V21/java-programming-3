package com.company;
import java.util.Scanner;
public class Palindrome {
    public static int rev(int num, int temp){
        if(num==0){
            return temp;
        }
        else {
            temp=(temp*10)+(num%10);
            return rev(num/10, temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        int temp = rev(num,0);
        if(temp==num)
        {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }
}
