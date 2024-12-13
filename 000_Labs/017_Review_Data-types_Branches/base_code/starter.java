/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What would you like your character name to be? ");
        String name = sc.nextLine();

        System.out.print("What would you like your title to be? ");
        String title = sc.nextLine();
        
        System.out.print("Do you want to be a Wizard, Warrior, or Rogue? "); 
        String person = sc.nextLine();
        
        if(person.equalsIgnoreCase("Wizard")){
            System.out.println("You have to be a comedian.");
        } else if(person.equalsIgnoreCase("Warrior")){
            System.out.println("Be a security guard.");
        } else if(person.equalsIgnoreCase("Rogue")){
            System.out.println("Act like the secret services.");
        }

        System.out.println("We are going to add superpowers!!\nStrength, Dexterity, Intelligence, Charisma.");
        System.out.println("BUT, there is a catch. You get a total of 20 points to use.");

        int points = 20; // Total points available
        int strength = 0, dexterity = 0, intelligence = 0, charisma = 0; // Initialize variables


        System.out.println("How many points would you like for Strength?");
        strength = sc.nextInt();
        if(strength > points || strength < 0) {
            System.out.println("Please choose a valid number (0 to " + points + ").");
            strength = sc.nextInt();
        }
        points -= strength;
        System.out.println("You currently have " + points + " points left.");

      
        if (points > 0) {
            System.out.println("How many points would you like for Dexterity?");
            dexterity = sc.nextInt();
            if(dexterity > points || dexterity < 0) {
                System.out.println("Please choose a valid number (0 to " + points + ").");
                dexterity = sc.nextInt();
            }
            points -= dexterity;
            System.out.println("You currently have " + points + " points left.");
        }

  
        if (points > 0) {
            System.out.println("How many points would you like for Intelligence?");
            intelligence = sc.nextInt();
            if(intelligence > points || intelligence < 0) {
                System.out.println("Please choose a valid number (0 to " + points + ").");
                intelligence = sc.nextInt();
            }
            points -= intelligence;
            System.out.println("You currently have " + points + " points left.");
        }

        
        if (points > 0) {
            System.out.println("How many points would you like for Charisma?");
            charisma = sc.nextInt();
            if(charisma > points || charisma < 0) {
                System.out.println("Please choose a valid number (0 to " + points + ").");
                charisma = sc.nextInt();
            }
            points -= charisma;
        }

      
        if (points < 0) {
            System.out.println("You have gone into negative points. Please run the program again.");
        } else {
            System.out.println("You currently have " + points + " points left.");
            System.out.println("Your character name is " + name + " and your title is " + title + ".");
            System.out.println(name + " chose " + person + ". " + name + " has " + strength + " points for Strength, " + dexterity + 
                               " points for Dexterity, " + intelligence + " points for Intelligence, and " + charisma + " points for Charisma.");
        }
    }
}
