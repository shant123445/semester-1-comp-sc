/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Give me an integer");
	int num1 = sc.nextInt();
	
	System.out.println("Give me another integer");
	int num2 = sc.nextInt();;
	
	System.out.println("Give me one more integer!!");
	int num3 = sc.nextInt();;
	
	int bigest = num1;
	
	if(num2 > num1){
		 bigest = num2;
			if(num3 > num2){
				 bigest = num3;
			}
	}
	
	else{
	 bigest = num1;
	}

	
	
	System.out.println("Different experiment, Give me an integer");
	int num4 = sc.nextInt();
	
	System.out.println("Give me another integer");
	int num5 = sc.nextInt();;
	
	System.out.println("Give me one more integer!!");
	int num6 = sc.nextInt();;
	
	int smallest = num4;
		
	if(num5 < num4){
		 smallest = num5;
			if(num5 < num5){
				 smallest = num5;
			}
	}
	
	else{
	 smallest = num4;
	}
	System.out.println("Your smallest number is " + smallest + "and your largest number is " + bigest);
		
	}
}
