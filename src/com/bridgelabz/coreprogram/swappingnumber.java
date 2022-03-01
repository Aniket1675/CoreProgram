package com.bridgelabz.coreprogram;

import java.util.Scanner;

public class swappingnumber
{
    public static void main(String[] args)
    {
        //int x = 100, y = 200;
        System.out.println("enter first number");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println("enter second number");
        int y= sc.nextInt();


        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
