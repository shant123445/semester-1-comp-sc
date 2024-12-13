import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Final Grade Calculator!");

       
        System.out.print("Enter your grade for assignments (0-100): ");
        double assignments = scanner.nextDouble();
        System.out.print("Enter the weight for assignments (as a percentage): ");
        double assignmentsWeight = scanner.nextDouble();

        
        System.out.print("Enter your grade for quizzes (0-100): ");
        double quizzes = scanner.nextDouble();
        System.out.print("Enter the weight for quizzes (as a percentage): ");
        double quizzesWeight = scanner.nextDouble();

       
        System.out.print("Enter your grade for exams (0-100): ");
        double exams = scanner.nextDouble();
        System.out.print("Enter the weight for exams (as a percentage): ");
        double examsWeight = scanner.nextDouble();

     
        double finalGrade = (assignments * (assignmentsWeight / 100)) +
                            (quizzes * (quizzesWeight / 100)) +
                            (exams * (examsWeight / 100));

     
        double totalWeight = assignmentsWeight + quizzesWeight + examsWeight;
        if (totalWeight != 100) {
            System.out.println("Warning: Total weight is" + totalWeight);
        }

        
        System.out.println("Your final grade is:"  + finalGrade);

        scanner.close();
    }
}
