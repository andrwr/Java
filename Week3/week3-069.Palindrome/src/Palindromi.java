import java.util.Scanner;
    
public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        
        int x = text.length() - 1;
        String str = "";
        int i = 0;
        while(x >= 0) {
            char a = text.charAt(x);
            str += a;
            
            x--;
        }
        System.out.println(str);
        if (str.equals(text)) {
                return true;
            }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
