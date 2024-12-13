/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
System.out.print("What would you like your character name to be?");
String name = sc.nextLine();

System.out.print("What would you like your title to be?");
String title = sc.nextLine();
		
System.out.print("Do you wanna be a Wizard  Warrior  or Rogue ?"); 
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

	
		if(person.equals("wizard")){
			System.out.println("You have to be a comedian");
		}
			 if(person.equals("warrior")){
				System.out.println("Be a security gaurd");
				}
					 if(person.equals("rogue")){
						System.out.println("Act like the secret services");
							
	}
									
								
	
	System.out.println("We are going to add superpowers!!/nStrength, Dexterity , Intelligence , Charisma");
	System.out.println("BUT , there is a catch. You get a total of 20 points to use");
	
	int points = 20;
	
	if (points>=0){
		
	System.out.println("How many points would you like for strength");
	int strength = sc.nextInt();
	
	if(strength>points){
		System.out.println("Please chose a number less than or equal to 10");
		strength = sc.nextInt();
	}
	points = (points - strength);
	System.out.println("You currently have " + points + " points");

	
		
if (points>=0){
		
	System.out.println("How many points would you like for Dexterity");
	int dexterity = sc.nextInt();
	
	if(dexterity>points){
		System.out.println("Please chose a number less than or equal to 10");
		dexterity = sc.nextInt();
	}
	points = (points - dexterity);
	System.out.println("You currently have " + points + " points");
	
}
		
if (points>=0){
		
	System.out.println("How many points would you like for Intelligence");
	int intelligence = sc.nextInt();
	
	if(intelligence>points){
		System.out.println("Please chose a number less than or equal to 10");
		intelligance = sc.nextInt();
	}
	points = (points - intelligence);
	System.out.println("You currently have " + points + " points");
	
}
	

if (points>=0){
		
	System.out.println("How many points would you like for charisma");
	int Charisma= sc.nextInt();
	
	if(Charisma>points){
		System.out.println("Please chose a number less than or equal to 10");
		Charisma = sc.nextInt();
	}
	points = (points - Charisma);
	System.out.println("You currently have " + points + " points");
	
	System.out.println("How many points would you like for Charisma");
	int Charisma = sc.nextInt();
	points = (points - Charisma);
	
	if(points<0){
		System.out.println("You have a negative number . Please chose a smaller value");
		points = (points - Charisma);
	}
	  


	
	System.out.println("You currently have " + points + " points");
	
	System.out.println("Your character name is " + name + " and your title is " + title);
	
	System.out.print(name + " chose " + person + name + " had " + strength + " points for strenth " + dexterity + " points for dexterity " + intelligence + " points for intelligence and  " + Charisma + " points for charisma" );

	

	
	
	

	}

}		

	
