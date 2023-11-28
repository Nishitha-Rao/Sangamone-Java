
package in.sode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Numbers_english {
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
     public static void convert(int number) throws IOException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        if (number == 0) {
            System.out.print("zero");
            return;
        }

        if (number < 10) {
            System.out.print(ones[number]);
            return;
        }

        if (number < 20) {
            System.out.print(teens[number - 11]);
            return;
        }

        if (number < 100) {
            int tensDigit = number / 10;
            int onesDigit = number % 10;

            System.out.print(tens[tensDigit] + " ");
            convert(onesDigit);
            return;
        }

        if (number < 1000) {
            int hundredsDigit = number / 100;
            int tensAndOnes = number % 100;

            System.out.print(ones[hundredsDigit] + " hundred ");
            convert(tensAndOnes);
            return;
        }

        if (number < 10000) {
            int thousandsDigit = number / 1000;
            int hundredsAndTensAndOnes = number % 1000;

            System.out.print(ones[thousandsDigit] + " thousand ");
            convert(hundredsAndTensAndOnes);
            return;
        }

        throw new IllegalArgumentException("Number is too large");
    }
    public static void main(String[] args) throws IOException {
        System.out.println("This program will work upto 9999");
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        convert(number);
        
    }
    
}
