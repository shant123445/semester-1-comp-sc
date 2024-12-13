import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int b = sc.nextInt();
        int answer = pow(a, b);
        System.out.println("answer = " + answer);
    } /

    public static int pow(int a, int b) {
        int result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result *= a;
            }
            a *= a;
            b >>= 1; 
        }
        return result; 
    } 
} 