/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("What day is it . Sunday is 0, Monday is 1, Tuesday 2 , ect");
		int day = sc.nextInt();
		
		
	if( day>=1 && day<=5){
	
	System.out.println("Alarm time is 7:00 :(");
	
	}else 
	System.out.println("Alarm time is 10:00 am . Sleep in a bit:)");
	}
}
