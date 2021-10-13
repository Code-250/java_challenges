package com.javaPrograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        scan and grab inputs from the user


        Scanner input = new Scanner(System.in);
        System.out.print("enter your value: ");
        double investmentValue = input.nextDouble();

        System.out.print("enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble()/100;

        System.out.print("enter investment range: ");
        double years = input.nextDouble();

        input.close();

//        assign our future investment function to a variable and output it.


        double futureInvestment = calculateFutureInvestment(investmentValue, interestRate, years);
        System.out.print("our future investment value is " + futureInvestment);
    }

//    implement a function that calculates the investment value

     private static double calculateFutureInvestment(double investmentValue, double years, double interestRate){
        return investmentValue * Math.pow((1 + (interestRate / 12 )),(years * 12));

    }
}
