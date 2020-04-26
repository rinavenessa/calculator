package com.rinavenessa;

import java.util.Scanner;

public class Add {
    public static void add(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("enter second number");
        int secondNumber = input.nextInt();
        int answer = firstNumber +  secondNumber;
        System.out.println(answer);
    }

}
