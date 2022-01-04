package com.company;

import java.util.Scanner;
interface loop {
    void loopNumbers(int number);
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        int num, number, y = 0, temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your input values: ");

        number = input.nextInt();
      y= number;

        while (number > 0) {
            num = number % 10;
            number = number / 10;
            temp = temp * 10 + num;
        }
        if (temp == y) {
            System.out.println("Number is a palindrome\n ");
        } else {
            System.out.println("not a palindrome\n ");
        }
    }
}
