package com.rinavenessa;

import java.util.Scanner;

public class Subtract {
    public static void subtract(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter first number:");
        int firstNumber = input1.nextInt();
        System.out.println("enter second number");
        int secondNumber = input1.nextInt();
        int answer = firstNumber -  secondNumber;
        System.out.println(answer);
    }
}
