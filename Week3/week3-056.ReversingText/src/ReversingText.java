
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        
        String x = "";
        int i = 0;
        while (text.length() > i) {
            char r = text.charAt(text.length()- 1 - i);
            
            x += r;
            i++;        
        }
        
        return x;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
