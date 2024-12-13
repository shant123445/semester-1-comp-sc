/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;



 class starter { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Please put in a number: ");
        int a = sc.nextInt();
        System.out.print("Choose any exponentt: ");
        int b = sc.nextInt();
        int answer = pow(a, b);
        System.out.println("Answer = " + answer);
    } 

    public static int pow(int a, int b) { 
        int result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = result * a;
            }
            a = a * a;
            b = b / 2;
        }
        return result; 
    } 
} 