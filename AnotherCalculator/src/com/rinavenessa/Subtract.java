package com.rinavenessa;

import java.util.Scanner;

public class Subtract {
    public void subtract(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter first number:");
        double firstNumber = input1.nextDouble();
        System.out.println("enter second number");
        double secondNumber = input1.nextDouble();
        double answer = firstNumber -  secondNumber;
        System.out.println(answer);
    }
}
