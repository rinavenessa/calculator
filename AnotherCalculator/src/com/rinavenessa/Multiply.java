package com.rinavenessa;

import java.util.Scanner;

public class Multiply {
    public static void multiply(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter first number:");
        double firstNumber = input2.nextInt();
        System.out.println("enter second number");
        double secondNumber = input2.nextInt();
        double answer = firstNumber *  secondNumber;
        System.out.println(answer);
    }
}
