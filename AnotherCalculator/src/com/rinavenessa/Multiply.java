package com.rinavenessa;

import java.util.Scanner;

public class Multiply {
    public static void multiply(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter first number:");
        int firstNumber = input2.nextInt();
        System.out.println("enter second number");
        int secondNumber = input2.nextInt();
        int answer = firstNumber *  secondNumber;
        System.out.println(answer);
    }
}
