import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many magic squared do you want?");
        int x = sc.nextInt();
        sc.nextLine();
       CVMath.findSpecial(x);
    }
}
