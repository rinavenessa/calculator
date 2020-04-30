package com.rinavenessa;

import java.util.Scanner;

public class Divide {
    public static void divide(){
        Scanner input3 = new Scanner(System.in);
        System.out.println("enter first number:");
        double firstNumber = input3.nextInt();
        System.out.println("enter second number");
        double secondNumber = input3.nextInt();
        double answer = firstNumber /  secondNumber;
        System.out.println(answer);
    }
}
