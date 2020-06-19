package com.company;
import java.util.Scanner;

public class Sequence2 {
    public static int print(int n, int k, int temp){
        if(temp<=0) {
                System.out.print(temp+" ");
                return print(-n, -k, temp + k);
        }
        else if(temp==-n){
            System.out.println(-n);
            return 0;
        }
        else {
            System.out.print(temp+" ");
            return print(n, k,temp-k);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        System.out.println("Enter the value of k:- ");
        int k = sc.nextInt();
        if(n>k)
        {
            int temp=print(n,k,n);
        }
        else {
            System.out.println("ERROR:-"+ k + " is greater than " + n);
        }
    }
}
