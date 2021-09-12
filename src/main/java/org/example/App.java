package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */

public class App 
{
    //Created a constant for the conversion
    public static final double conversionRate = 350;
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length?");
        int length = input.nextInt();//Input
        System.out.println("What is the width");
        int width = input.nextInt();//Input
        //Calculating the amount of gallons needed and rounding it up
        double gallons = (length * width)/conversionRate;
        gallons = Math.ceil(gallons);
        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + (length*width) + " square feet.");//Output
    }
}
