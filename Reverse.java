
package assignments;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {
   
    public static void main(String[] args)throws IOException {
        String inputFile = "Names.txt";
        String outputFile = "output.txt";

        try {
            // Read all lines from the file, reverse them, and collect into a List
            List<String> reversedLines = Files.readAllLines(Paths.get(inputFile))
                    .stream()
                    .map(line -> new StringBuilder(line).reverse().toString())
                    .collect(Collectors.toList());

            // Reverse the order of lines
           // Collections.reverse(reversedLines);

            // Write the reversed content back to the file
            Files.write(Paths.get(outputFile), reversedLines);

            System.out.println("Reversed content has been written to " + outputFile);
            
            // Print the contents of the output file
            System.out.println("Contents of " + outputFile + ":");
            printFileContents(outputFile);          
        } 
        catch (IOException e) {
            e.printStackTrace();
        }       
    }
     private static void printFileContents(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        lines.forEach(System.out::println);
    }
}
