import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AppendFile {
    public static void main(String[] args) {

        String filePath;

        // The text you want to append
        String text;
        
        try {
            Scanner in =new Scanner(System.in);
             // Specify the file path you want to append to
            System.out.println("Enter File Path (use double slash):");
            filePath=in.nextLine();
            // Create a FileWriter in append mode
            FileWriter fw = new FileWriter(filePath, true);

            // Create a BufferedWriter for efficient writing
            BufferedWriter bw = new BufferedWriter(fw);
             // The text you want to append
            System.out.println("Enter text to append the File:");
            text=in.nextLine();
            bw.newLine(); 
            // Append the text to the file
            bw.write(text);
            bw.newLine(); // Add a newline for clarity

            // Close the BufferedWriter to flush and release resources
            bw.close();

            System.out.println("Text appended to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
