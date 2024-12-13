package pkg;

public class CVMath {
    public static int findMid(int one, int two, int three) {
        return (one + two + three - Math.min(one, Math.min(two, three)) 
                - Math.max(one, Math.max(two, three)));
    }

    public static boolean checkSquare(double num) {
        double a;
        int c;
        a = Math.sqrt(num);
        c = (int)(Math.sqrt(num));
        if (a == c) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAdded(double num) {
        double num1 = num;
        for (int i = 0; num1 > 0; i++) {
            num1 = num1 - i;
        }
        if (num1 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void findSpecial(int n) {
        int counter, test;
        counter = 0;
        test = 1;
        while (counter < n) {
            if (isAdded(test) && checkSquare(test)) {
                System.out.println(test);
                counter = counter + 1;
            }
            test++;
        }
    }
}
