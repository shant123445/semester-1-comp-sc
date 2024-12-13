/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myJob {
	String job;
	
	public myJob (){
		job = "No Role";
	
	
	}
	
	public String myJob(String a) {
		job = a;
		if(job.equals("Rogue") || job.equals("rogue")){
			System.out.println("Are you sneaky. If so murder your biggest opp.");
			
			return job;
		}
		else if(job.equals("Warrior") || job.equals("warrior")){
			System.out.println("Sign yourself up for the next UFC event");
			
			return job;
		}
		else if(job.equals("Wizard") || job.equals("wizard")){
			System.out.println("You mess with potions huh?");
			
			return job;
		}
		else{
			System.out.println("You didnt chose anyhting.");
			
			return job;
		}
		
		
	}

}

