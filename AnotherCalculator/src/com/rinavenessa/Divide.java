package com.rinavenessa;

import java.util.Scanner;

public class Divide {
    public static void divide(){
		/**
    	 * This is a huge improvement from Calculator1, well done! Calculator1 was a software developer's
    	 * solution. This is a software engineer's solution, its absolutely brilliant. Well done on OOP.
    	 * 
    	 * The idea is to have interaction with the user in a single focal point of the project, which 
    	 * is the main method in the Main class for this project. Notice that you are creating the variables 
    	 * firstNumber, secondNumber and answer in all your classes and asking the user for input in all 
    	 * classes as well. The asking of user input must be done in the main method in the Main class.
    	 * 
    	 * My advice? Make your classes return integers (or double or float for division - or you could
    	 * leave it as is for integer division). I wonder if you are aware that 5/2 gives you 2, and not 2.5
    	 * as expected? Also, pass firstNumber and secondNumber as parameters for the class, and add them to
    	 * the class when you call it from the instantiated object in main method. Thabi implemented something
    	 * similar to this on the solution I asked him to share with you.
    	 * 
    	 * Again, this is great work, and your solution works as expected. But I want to direct you on the OOP
    	 * way of doing things as you requested. Let me know how this goes.
    	 */
        Scanner input3 = new Scanner(System.in);
        System.out.println("enter first number:");
        int firstNumber = input3.nextInt();
        System.out.println("enter second number");
        int secondNumber = input3.nextInt();
        int answer = firstNumber /  secondNumber;
        System.out.println(answer);
    }
}
