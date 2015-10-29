
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = reader.nextLine();
        System.out.print("Enter second word: ");
        String word2 = reader.nextLine();
        
        int x = word1.indexOf(word2);
        
        
        if (x != -1) {
            String newword = word1.substring(x, word2.length() + x);
            System.out.println("The word '" + newword + "' is found in the word '" + word1 + "'.");
            
        } else {
            System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'.");
        }
        
        
    }
}
