
package in.sode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class CSV {
    public static void main(String[] args) throws Exception {
        //get the contents of a CSV file in Java 
        //Using BufferedReader and String manipulation
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Sample.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        }
        System.out.println("Records: " + records);
        
    }
    
}
