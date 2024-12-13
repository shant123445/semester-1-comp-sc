
/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("What is your name? ");
  String name = scanner.nextLine();
  
  System.out.println("How old are you? ");
  int age = scanner.nextInt();
  scanner.nextLine();
  
  System.out.println("What is your birth month?");
  String birthmonth = scanner.nextLine();
  
    
  System.out.println("What is your birth date?");
  String birthdate = scanner.nextLine();
  
    
  System.out.println("What is your birth year?");
  String birthyear = scanner.nextLine();
  
    System.out.println("How much is a buck fifty");
  String money= scanner.nextLine();
   
   
  System.out.println("Hello "+ name);
  System.out.println("You are " + age + "years old");
  System.out.println("You were born on " + birthmonth +" " + birthdate +"," +birthyear);
  System.out.print("You think a buck fifty is equal to " + money );

 } 
}