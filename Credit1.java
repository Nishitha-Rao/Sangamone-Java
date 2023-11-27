
package in.sode;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Credit1 {
    public static ArrayList seperate1(String s1){
        ArrayList<String> odd_even = new ArrayList<>();
        String cc1 = s1;
        int len1 = cc1.length();
        String odd = "";
        String even = "";
        String temp = "";
        
        for(int i=0;i<len1/2;i++){
           temp = cc1.substring(2*i,1+2*i);
           odd = odd + temp;  
        }
        
        for(int i=1;i<(len1/2)+1;i++){
            temp = cc1.substring((2*i)-1,2*i);
            even = even + temp;
        }
        
        odd_even.add(odd);
        odd_even.add(even);
        return odd_even;
    }
    public static void main(String[] args)throws Exception{
        FileWriter fw1 = new FileWriter("city1.txt");
        FileWriter fw2 = new FileWriter("city2.txt");
        File f1 = new File("in5.txt");
        Scanner sc1 = new Scanner(f1);
        ArrayList<String> result1 = new ArrayList<>(); 
        String cc1_odd = "";
        String cc1_even = "";
        result1 = seperate1("1234567898765432");
        cc1_odd = result1.get(0);
        cc1_even = result1.get(1);
        System.out.println(cc1_odd);
        System.out.println(cc1_even);
        fw1.write(cc1_odd);
        fw2.write(cc1_even);
        fw1.close();
        fw2.close();
    }
}
