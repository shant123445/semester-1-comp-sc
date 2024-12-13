/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

public class TextHandler {

    // Method to count how often a term appears in the array
    public static int countTerm(String[] words, String term) {
        int frequency = 0;
        for (String word : words) {
            if (word.equals(term)) {
                frequency++;
            }
        }
        return frequency;
    }

    // Method to find the word that appears the most in the array
    public static String findFrequentWord(String[] words) {
        String mostFrequent = "";
        int highestFrequency = 0;

        for (String candidate : words) {
            int frequency = 0;
            for (String word : words) {
                if (word.equals(candidate)) {
                    frequency++;
                }
            }
            if (frequency > highestFrequency) {
                highestFrequency = frequency;
                mostFrequent = candidate;
            }
        }
        return mostFrequent;
    }

    // Method to display all words in the array
    public static void showWords(String[] words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    // Method to display the words in reverse order
    public static void showWordsInReverse(String[] words) {
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }

    // Method to display a specified number of words from the array
    public static void showSomeWords(String[] words, int count) {
        if (count > words.length) {
            System.out.println("Requested count exceeds the number of words! Please try again.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sampleText = {"cat", "dog", "cat", "bird", "dog", "cat"};
        String userChoice;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Display all words");
            System.out.println("2. Display words in reverse");
            System.out.println("3. Display a limited number of words");
            System.out.println("4. Count occurrences of a term");
            System.out.println("5. Find the most frequent word");
            System.out.println("6. Exit");
            System.out.print("Your choice: ");
            userChoice = input.nextLine();

            switch (userChoice) {
                case "1":
                    showWords(sampleText);
                    break;
                case "2":
                    showWordsInReverse(sampleText);
                    break;
                case "3":
                    System.out.print("How many words would you like to display? ");
                    int numWords = input.nextInt();
                    input.nextLine(); // Consume newline
                    showSomeWords(sampleText, numWords);
                    break;
                case "4":
                    System.out.print("Enter the term to count: ");
                    String term = input.nextLine();
                    int termCount = countTerm(sampleText, term);
                    System.out.println("The term \"" + term + "\" appears " + termCount + " times.");
                    break;
                case "5":
                    String frequentWord = findFrequentWord(sampleText);
                    System.out.println("The most frequent word is: " + frequentWord);
                    break;
                case "6":
                    System.out.println("Goodbye!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println("----------------");
        }
    }
}
