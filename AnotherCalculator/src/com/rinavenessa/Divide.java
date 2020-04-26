package com.rinavenessa;

import java.util.Scanner;

public class Divide {
    public static void divide(){
        Scanner input3 = new Scanner(System.in);
        System.out.println("enter first number:");
        int firstNumber = input3.nextInt();
        System.out.println("enter second number");
        int secondNumber = input3.nextInt();
        int answer = firstNumber /  secondNumber;
        System.out.println(answer);
    }
}
