/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a word or a phrase por favor");
		String sentence = sc.nextLine();
		
		
		
		int space1 = sentence.indexOf(" ");
		int space2 = sentence.indexOf(" ", space1 + 1);
		int space3 = sentence.indexOf(" ", space1 + 2);
		
		if(space1 == -1 || space2 == -1){
					System.out.println("errorrr not enough characters!!!");

		}
		
		String word1 = sentence.substring(0,space1);
		String word2 = sentence.substring(space1 + 1, space2);
		String word3 = sentence.substring(space2 + 1);
		
		System.out.println("The opposite of what you said would be:");
		System.out.print(word3 + " " + word2 + " " + word1);
		



		
	}
}
