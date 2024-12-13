/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	 
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Whats your first number?");
	int num1 = scanner.nextInt();
	
	System.out.println("Whats your second number?");
	int num2 = scanner.nextInt();
	
	System.out.println("Your range is " + num1 + " through " + num2);
	System.out.println((int)(Math.random()*num1)+(num2-num1)); 
	System.out.println((int)(Math.random()*num1)+(num2-num1)); 	
	System.out.println((int)(Math.random()*num1)+(num2-num1)); 
	System.out.println((int)(Math.random()*num1)+(num2-num1)); 
	System.out.println((int)(Math.random()*num1)+(num2-num1)); 
	System.out.println((int)(Math.random()*num1)+(num2-num1)); 
	
	}
}
