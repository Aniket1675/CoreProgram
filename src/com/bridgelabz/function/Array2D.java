package com.bridgelabz.function;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D
{
    static Scanner scan = new Scanner(System.in);

    public static int[][] arrayInt(int m, int n)
    {
        int a[][] = new int[m][n];
        System.out.println();
        System.out.println("Integer Array");

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = scan.nextInt();
            }
        }
        return a;
    }
    public static void display(int[][] a, int m, int n)
    {
        PrintWriter pw = new PrintWriter(System.out, true);
        System.out.println();
        pw.println("2D ARRAY INTEGER");

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                pw.print("\t" + a[i][j] + " ");
            }
            pw.println("\t");
        }
    }
    <t> void displayArray(t[][] arr)    //Generic method for displaying 2d array
    {
        PrintWriter pw = new PrintWriter(System.out);
        System.out.println();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                pw.print("\t" + arr[i][j] + " ");
            }
            pw.println("\t");
        }
    }
    public static void main(String[] args) {

        System.out.println("Enter number of rows: ");
        int m = scan.nextInt();
        System.out.println("Enter number of columns: ");
        int n = scan.nextInt();

        // calling methods
        int[][] a = arrayInt(m, n);

        // calling display method
        display(a,m,n);

    }
}
