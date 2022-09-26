package com.company;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator for 2 numbers");
        System.out.println("First number");
        int a = sc.nextInt();
        System.out.println("Second number");
        int b = sc.nextInt();
        System.out.println("press 1 to add");
        System.out.println("press 2 to Subtract");
        System.out.println("press 3 to Multiply");
        System.out.println("press 4 to Divide");
        System.out.println("press 5 to see Remainder");
        int c = sc.nextInt();
        switch (c){
            case 1: int i = a + b;
            System.out.println(i);break;
            case 2: int j =a-b;
                System.out.println(j);break;
            case 3: int k =a*b;
                System.out.println(k);break;
            case 4: int l =a/b;
                System.out.println(l);break;
            case 5: int m =a%b;
                System.out.println(m);break;
            default: System.out.println("Invalid");

        }

    }
}
