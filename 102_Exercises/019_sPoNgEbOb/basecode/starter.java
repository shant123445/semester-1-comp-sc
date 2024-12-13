import java.util.Scanner;

class Starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or phrase:");
        String sentence = sc.nextLine();
        
        while(true) {
            if (sentence.indexOf(" ") == -1) {
                System.out.println(spongeCase(sentence));
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            System.out.println(spongeCase(word));
            sentence = sentence.substring(space + 1);
        }
    }
}
  
   


