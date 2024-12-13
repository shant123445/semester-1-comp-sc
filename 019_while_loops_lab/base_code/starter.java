/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
	System.out.println("Chose a name you would like to print");
			String n = sc.nextLine();
			
	System.out.println("How many times woudld you like to repeat this name");
			int repeat = sc.nextInt();

	
	while(count < repeat){
	System.out.println(n);
	count++;
	
	}



		
	}
}
