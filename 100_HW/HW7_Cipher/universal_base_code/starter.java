/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int c = 1;
		while(c < 37){
			Scanner sc = new Scanner(System.in);
			Cipher cipher = new Cipher();
			System.out.print("put a new message so i can decode it");
			String message = sc.nextLine();
			String decodedMessage = cipher.decoded(message);
			System.out.println("Decoded message is:" + decodedMessage);
			
			System.out.print("Enter a key for a keyed decoding:");
			int key = sc.nextInt;
			String keydecodedMessage = cipher.encode(message);
			System.out.println("Keyed decoded message : " + keydecodedMessage);
		}

	}
}
