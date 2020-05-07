package com.rinavenessa;

import java.util.Scanner;

public class Divide {
    public void divide(){
        Scanner input3 = new Scanner(System.in);
        System.out.println("enter first number:");
        double firstNumber = input3.nextDouble();
        System.out.println("enter second number");
        double secondNumber = input3.nextDouble();
        double answer = firstNumber /  secondNumber;
        System.out.println(answer);
    }
}
