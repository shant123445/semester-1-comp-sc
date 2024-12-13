/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		
System.out.print("Do you wanna be a Wizard  Warrior  or Rogue "); 
	String person = sc.nextLine();
	
	if(person.equals("Wizard")){
		System.out.println("You have to be a comedian");
	}
	else if(person.equals("Warrior")){
		System.out.println("Be a security gaurd");
	}
	else if(person.equals("Rogue")){
		System.out.println("Act like the secret services");
	}
	else{
		System.out.println("You typed in the wrong thing");
	}	
	
	
	
	}	
}
