/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);


    int num = (int) (Math.random() * 1000);
	System.out.print("Guess a number 1-1000  ");
	int guess = sc.nextInt();
	
	

	
	while(guess != num){
		if(guess < num){
			System.out.println("To little");
			System.out.print("Guess again ");
			guess = sc.nextInt();
		}
			 if(guess > num){
			
			System.out.println("To high");
			System.out.print("Guess a number again  ");
			 guess = sc.nextInt();
			
		}
			if(guess == num){
				
			
				System.out.println("Correct");
				
			}
		}
	}



		
	}

