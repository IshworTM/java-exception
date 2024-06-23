package ChapterFive;
import java.io.BufferedReader;
import java.io.FileReader;

public class uncheckedException {
    public static void main(String[] args) {
        // Checked FileNotFoundException
        try {
            FileReader file = new FileReader("/home/rowshi/Documents/test.txt");
            BufferedReader fileInput = new BufferedReader(file);

            for (int i = 0; i < 3; i++) {
                System.out.println(fileInput.readLine());
            }
            fileInput.close();
            
        } catch (Exception e) {
            System.out.println("Nice error bro: " + e.getMessage());
        }
    }
}
