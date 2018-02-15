package pl.szyszjola;

import java.lang.invoke.ConstantCallSite;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int rand = (int)(Math.random() *100) + 1;
	boolean hasWon = false;
	System.out.println("I have randomly choose number between [0:100]");
	System.out.println("Can you guess this number?");
	System.out.println("Lets check! Give me the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 1; i < 10; i ++) {
            if (number == rand) {
                hasWon = true;
                break;
            } else if (number > rand)
                System.out.println("It's smaller than " + number);
            else
                System.out.println("It's higher than " + number);
            System.out.println(10-i + " guesses left!" +" Give another number:");
            number = scanner.nextInt();
        }
        if (hasWon)
        System.out.println("You guess! This number is " + rand +"!");
        else
            System.out.println("Don't worry, you can try later. Ps. random number was: " + rand);
    }
}
