package com.company;
import java.util.Scanner;
public class Sequence {
    public static int print(int n, int temp){
        if(temp<=0) {
            if(temp==-n)
            {
                return n;
            }
            else {
                System.out.print(-1 * temp + " ");
                return print(n, (temp - 1));
            }
        }
        else {
            System.out.print(temp+" ");
            return print(n,temp-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        int temp=print(n,n);
        System.out.println(temp);
    }
}
