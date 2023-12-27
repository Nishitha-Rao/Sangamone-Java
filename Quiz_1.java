package in.sode;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Quiz_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:System.out.println("Capital quiz");
                capital();
                break;
            case 2:System.out.println("Currency quiz");
                currency();
                break;
            case 3:System.out.println("Sports quiz");
                sports();
                break;
            default:System.out.println("invalid input");
            break;
        }
        
        
    }
     private static void capital() throws FileNotFoundException {
        File quizFile = new File("Quiz_Capitals.csv");
        if (!quizFile.exists() || !quizFile.isFile()) {
            System.out.println("File not found: Quiz_Capitals.csv");
            return;
        }
        Scanner fileScanner = new Scanner(quizFile);
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int maxMarks = 10;
        String[] questionData;
        String question, correctAnswer, userAnswer;
        for (int i = 0; i < 3 && fileScanner.hasNextLine(); i++) {
            questionData = fileScanner.nextLine().split(",");
            if (questionData.length >= 2) {
                question = "What is the capital of " + questionData[0] + "?";
                correctAnswer = questionData[1];
                System.out.println(question);
                userAnswer = sc.nextLine();
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    totalMarks += maxMarks;
                }
            }
        }
        System.out.println("Total Marks: " + totalMarks);
        fileScanner.close();
        sc.close();
     }
     
     private static void currency() throws FileNotFoundException {
        File quizFile = new File("Quiz_Currency.csv");
        if (!quizFile.exists() || !quizFile.isFile()) {
            System.out.println("File not found: Quiz_Currency.csv");
            return;
        }
        Scanner fileScanner = new Scanner(quizFile);
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int maxMarks = 10;
        String[] questionData;
        String question, correctAnswer, userAnswer;
        for (int i = 0; i < 3 && fileScanner.hasNextLine(); i++) {
            questionData = fileScanner.nextLine().split(",");
            if (questionData.length >= 2) {
                question = "What is the currency of " + questionData[0] + "?";
                correctAnswer = questionData[1];
                System.out.println(question);
                userAnswer = sc.nextLine();
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    totalMarks += maxMarks;
                }
            }
        }
        System.out.println("Total Marks: " + totalMarks);
        fileScanner.close();
        sc.close();
     }
     
     private static void sports() throws FileNotFoundException {
        File quizFile = new File("Quiz_Sport.csv");
        if (!quizFile.exists() || !quizFile.isFile()) {
            System.out.println("File not found: Quiz_Sport.csv");
            return;
        }
        Scanner fileScanner = new Scanner(quizFile);
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int maxMarks = 10;
        String[] questionData;
        String question, correctAnswer, userAnswer;
        for (int i = 0; i < 3 && fileScanner.hasNextLine(); i++) {
            questionData = fileScanner.nextLine().split(",");
            if (questionData.length >= 2) {
                question = "With which sport " + questionData[0] + " is associated with?";
                correctAnswer = questionData[1];
                System.out.println(question);
                userAnswer = sc.nextLine();
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    totalMarks += maxMarks;
                }
            }
        }
        System.out.println("Total Marks: " + totalMarks);
        fileScanner.close();
        sc.close();
     }
}
