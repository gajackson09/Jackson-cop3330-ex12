/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program computes simple interest
import java.util.Scanner;
public class ex12{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);          

    System.out.print("Enter the principal: ");
       int principal = input.nextInt();
    System.out.print("Enter the rate of interest: ");
       double rate = input.nextDouble();
    System.out.print("Enter the number of years: ");
       int years = input.nextInt();

    int investment = (int)Math.round(principal*(1+rate*years*0.01));

    System.out.println("After "+years+" years at "+rate+"%, the investment will be worth $"+investment);
 
   }//end of main
}//end of class