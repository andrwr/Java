
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int x = 1;
        System.out.print("Up to what number? ");
        int r = Integer.parseInt(reader.nextLine());
        
        while (x <= r) {
            System.out.println(x);
            x++;
            
        }
        
    }
}
