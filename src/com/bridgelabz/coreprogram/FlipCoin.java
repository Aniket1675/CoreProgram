package com.bridgelabz.coreprogram;

import java.util.Scanner;

public class FlipCoin
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        String response;
        char tossResults;
        int headCount = 0;
        int tailCount = 0;

        System.out.println("\n\nEnter either h for heads or t for tails");
        System.out.println("for five coin tosses:\n");

        System.out.print("First toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
            headCount++;
        if(tossResults == 't')
            tailCount++;

        System.out.print("Second toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
            headCount++;
        if(tossResults == 't')
            tailCount++;

        System.out.print("Third toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
            headCount++;
        if(tossResults == 't')
            tailCount++;

        System.out.print("Fourth toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
            headCount++;
        if(tossResults == 't')
            tailCount++;

        System.out.print("Fifth toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
            headCount++;
        if(tossResults == 't')
            tailCount++;



        System.out.println("\nNumber of heads: " + headCount);
        System.out.println("Number of tails: " + tailCount);

        float percentHeads = ((float)headCount / 5) * 100;
        System.out.println("Percent heads: " + percentHeads + '%');

        float percentTails = ((float)tailCount / 5) * 100;
        System.out.println("Percent tails: " + percentTails + "%\n");


    }
}
