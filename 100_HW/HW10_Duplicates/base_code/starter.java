/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
/*

*/import java.util.*;

class Starter {
    public static void main(String args[]) {
        int shant[] = new int[20];
        int numDups = 0;

        for (int i = 0; i < shant.length; i++) {
            shant[i] = (int)(Math.random() * 10 + 1);
        }

        for (int i = 0; i < shant.length; i++) {
            System.out.println(shant[i]);
        }

        int num = (int)(Math.random() * 10 + 1);
        System.out.println("number equals " + num);

        for (int i = 0; i < shant.length; i++) {
            if (num == shant[i]) {
                numDups++;
                System.out.println("There is a duplicate at index " + i);
            }
        }
        
        System.out.println("There are " + numDups + " duplicates");
        System.out.println("");

        for (int i = 1; i < shant.length; i++) {
            if (shant[i] == shant[i - 1]) {
                System.out.println("index " + i + " and " + (i - 1) + " are consecutive duplicates of " + shant[i]);
            }
        }
    }
}
