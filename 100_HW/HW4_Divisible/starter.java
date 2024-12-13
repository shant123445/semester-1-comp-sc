/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Chose dos numbers");
	 int num1 = sc.nextInt();
	 sc.nextLine();
	 int num2 = sc.nextInt();
	 sc.nextLine();
	 if((num1 % 2 )== 0){
	 	System.out.println(num1 + " is an even num");
	 	
	 }
	 else{
	 		System.out.println(num1 + " is an odd num");
	  }
	  if((num2 % 2 )== 0){
	 	System.out.println(num2 + " is an even num");
	 	
	 }
	 else{
	 		System.out.println(num2 + " is an odd num");
	  }
	  
	 if((num1 % 3 == 0 )&& (num1 % 4 == 0) && (num1 % 5 == 0)){
	 System.out.println(num1  + "is divisble by 3,4,5");
	 }
	 
	 else{
	 	System.out.println(num1 + " is not divisbile by 3, 4, and 5");
	 }
	 
	  if((num2 % 3 == 0 )&& (num2 % 4 == 0) && (num2 % 5 == 0)){
	 System.out.println(num2  + " is divisble by 3,4,5");
	 }
	 
	 else{
	 	System.out.println(num2 + " is not divisbile by 3, 4, and 5");
	 }
	 
		
	}
}
