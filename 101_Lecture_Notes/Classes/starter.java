/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        potato fry = new potato();
        boolean x = fry.getEdibility();
        System.out.println(x);
        potato sp = new potato("Blue","Baked",100);
        System.out.println(sp.getEdibility());
        sp.eatpotato();
	}
}