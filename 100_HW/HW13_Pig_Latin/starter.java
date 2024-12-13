import java.util.Scanner;

public class starter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to translate into Pig Latin:");
        
        String inputSentence = scanner.nextLine();
        int currentIndex = 0;

        while (currentIndex < inputSentence.length()) {
            int spaceIndex = inputSentence.indexOf(" ", currentIndex);
            if (spaceIndex == -1) {
                System.out.print(pigLatin(inputSentence.substring(currentIndex)));
                break;
            }

            System.out.print(pigLatin(inputSentence.substring(currentIndex, spaceIndex)) + " ");
            currentIndex = spaceIndex + 1;
        }
    }

    public static String pigLatin(String word) {
        word = word.toLowerCase();
        String firstLetter = word.substring(0, 1);

        if (firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i") 
            || firstLetter.equals("o") || firstLetter.equals("u")) {
            return word + "way";
        }

        return word.substring(1) + firstLetter + "ay";
    }
}
