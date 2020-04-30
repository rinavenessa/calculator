package com.rinavenessa;

import java.util.Scanner;

public class Subtract {
    public static void subtract(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter first number:");
        double firstNumber = input1.nextInt();
        System.out.println("enter second number");
        double secondNumber = input1.nextInt();
        double answer = firstNumber -  secondNumber;
        System.out.println(answer);
    }
}
