/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	public static void main(String args[]) {
		
		System.out.println("You have no job right now. Please pick if you want your role to be Rogue, Warrior, or Wizard ");
		myJob test = new myJob();
		Scanner sc = new Scanner(System.in);
		String character = sc.nextLine();
		System.out.println("You are now a " + test.	myJob(character));
	}
}
