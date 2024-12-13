/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;


class LectureIf{
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("You really want Micky D's , How are you gonna get your food");
    System.out.println("1.Walk to the nearest McDonald's and enjoy the fresh air");
    System.out.println("2.Order a ride-share for a quick trip.");
    System.out.println("3.Take your bike for a fun, adventurous ride through the park.");
    int answer = sc.nextInt();
    
    if(answer == 1){ 
    System.out.println("You chose to burn some calories before you gained a couple thousand good work!"); 
	}
    
    else if (answer == 2){
    System.out.println("Dam Son, you must be rich, ordering a ride share is NOT cheap!");   
    }
    
    else{
    System.out.println("I see you chose to ride your bike. Fun qway to exercise and to take a stroll out in the city");    
    }
    
    
        
        
      
    
    }
        
        
        
}