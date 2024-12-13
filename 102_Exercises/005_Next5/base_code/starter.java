/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("please enter a number");
	int number =  scanner.nextInt();

	
	System.out.println("Here are the next 5 numbers");
	System.out.print(number + 1 + "    ");
	System.out.print(number + 2 + "    ");
	System.out.print(number + 3 + "    ");
	System.out.print(number + 4 + "    ");
	System.out.println(number + 5 + "    ");
	
	System.out.println("Here are the next 5 multiples");
	System.out.print(number * 1 + "    ");
	System.out.print(number * 2 + "    ");
	System.out.print(number * 3 + "    ");
	System.out.print(number * 4 + "    ");
	System.out.println(number * 5 + "    ");
	
	System.out.println("This is your chosen number divided by 100\n" + number/100.0);
	System.out.print("This is your chosen number divided by 10\n" +number/10.0);
	


	}
}
