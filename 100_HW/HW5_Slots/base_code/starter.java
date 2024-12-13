/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("We are playing at the slots. You have a $100 bucks . Good luck!");
	Scanner sc = new Scanner(System.in);
	int money = 100;
	int answer;
	int rand1;
	int rand2;
	int rand3;
	
	while (money>0){
		System.out.println("Budget = " + money);
		System.out.println("How much do you wanna put in?");
		answer = sc.nextInt();
		money  = money - answer;
		
		rand1 = (int)(Math.random()*9)+1;
		rand2 = (int)(Math.random()*9)+1;
		rand3 = (int)(Math.random()*9)+1;
		
		System.out.println(rand1 + "||" + rand2 + "||" + rand3);
		
		if(rand1 == rand2 && rand1 == rand3){
			answer = answer * 3;
			money = money + answer;
			System.out.println(" And we have gotten a WINNNER!!! JACKPOTTTTT");
		}
			else if( rand1 == rand2 || rand2 == rand3 || rand2 == rand3){
				answer = answer * 2;
				money = money + answer;
				System.out.println(" And we have gotten a WINNNER!!! You got 2 of the same numbers. Good Stuff");
			
			}
				else{
					System.out.println("Dang you didnt win");
				}
				
	}
	System.out.println("U lost all your money:)))");
	
	}
}
		
	
	