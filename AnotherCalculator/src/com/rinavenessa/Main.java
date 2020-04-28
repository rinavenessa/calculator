package com.rinavenessa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		 // please try to enact a menu system with numbers here. It simplifies the process for the user.
        Scanner sign = new Scanner(System.in);
        System.out.println("choose operator between + - * / ");
        System.out.println("enter operator:");
        char operator = sign.next().charAt(0);
		// well done on instantiating the objects here, looks good :)
        Add obj = new Add();
        Subtract obj1 = new Subtract();
        Multiply obj2 = new Multiply();
        Divide obj3 = new Divide();


		// nice touch with the switch statement!
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
			// also, please alert the user of the answer. A number just displays without context of what it is after entering firstNumber and secondNumber.
        }
    }
}
