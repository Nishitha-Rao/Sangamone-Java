package in.sode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Figures_to_words {
    public static void convert20(int n1)throws IOException {
        File f1=new File("words6.txt");
        ArrayList<String> list1=new ArrayList<>();
        Scanner sc1=new Scanner(f1);
        while(sc1.hasNextLine()) {
            list1.add(sc1.nextLine());
        }
        String word1;
        int num1=n1;
        word1=list1.get(num1-1);
        System.out.print(word1+" ");
	}
    
    public static void main(String[] args) throws IOException {
        System.out.println("This program will work upto 29");
        System.out.println("Enter any number: ");
        Scanner sc2=new Scanner(System.in);
        int num1=sc2.nextInt();
        if(num1<=20) {
            convert20(num1);
        }
        else {
            int part1=(num1/10)*10;
            int part2=num1%10;
            convert20(part1);
            convert20(part2);
        }   
    }  
}
