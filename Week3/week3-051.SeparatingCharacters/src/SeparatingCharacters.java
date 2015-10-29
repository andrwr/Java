
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        
        int x = name.length();
        int i = 0;
        while (x > 0) {
            System.out.println((i + 1) + ". character: " + (name.charAt(i)));
            i++;
            x--;
        }
        
        
    }
}
