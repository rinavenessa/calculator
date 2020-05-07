package com.rinavenessa;

import java.util.Scanner;

public class Add {
    public void add(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        double firstNumber = input.nextDouble();
        System.out.println("enter second number");
        double secondNumber = input.nextDouble();
        double answer = firstNumber +  secondNumber;
        System.out.println(answer);
    }

}
