package com.rinavenessa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sign = new Scanner(System.in);
        System.out.println("choose operator between + - * / ");
        System.out.println("enter operator:");
        char operator = sign.next().charAt(0);

        Add obj = new Add();
        Subtract obj1 = new Subtract();
        Multiply obj2 = new Multiply();
        Divide obj3 = new Divide();



        switch (operator){
            case '+':
                obj.add();
               // System.out.println( );
                break;
            case '-':
                obj1.subtract();
                break;
            case '*':
               obj2.multiply();
                break;
            case '/':
                obj3.divide();
                break;

            default:
                System.out.println("Enter a valid operator.");
        }
    }
}
