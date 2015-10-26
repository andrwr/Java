
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        
        System.out.print("Type a number: ");
        
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.print("\nType another number: ");
        
        int y = Integer.parseInt(reader.nextLine());
        
        int sum = x + y;
        
        System.out.println("Sum of the numbers: " + sum);
    }
}
