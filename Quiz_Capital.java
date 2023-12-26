package in.sode;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Quiz_Capital {

    public static void main(String[] args) throws FileNotFoundException {
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
    
}
