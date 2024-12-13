/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int number = (int)((Math.random()) * 101);
	System.out.println("We are going to be playing a geussing game 0-100 . Guess a number");
	int guess = sc.nextInt();

	
		
	if(guess > number){
	System.out.println("The number is less");
	}
	else if (guess < number){
		System.out.println("The numebr is bigger");
	}
	else{
		System.out.println("Your number is correct");
	}
}
}

