/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int[]i = new int[1001];
		int c = 0;
		int num = 0;
		while(c<1001){
			
			i[c] = 3 + num;
			System.out.println(i[c]);
			i[c] = num + num;
			num = num + 3;
			c++;
		}
		int[]f = new int[1001];
		int c1 = 0;
		int num1 = 0;
		while(c1 < 1001){
			f[c1] = 1000 - num1;
			System.out.println(f[c1]);
			num1++;
			c1++;
		}
			
	}
}
