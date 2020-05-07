package com.rinavenessa;

import java.util.Scanner;

public class Multiply {
    public void multiply(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter first number:");
        double firstNumber = input2.nextDouble();
        System.out.println("enter second number");
        double secondNumber = input2.nextDouble();
        double answer = firstNumber *  secondNumber;
        System.out.println(answer);
    }
}
