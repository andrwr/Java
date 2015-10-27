
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x = 1;
        int sum = 0;
        
        System.out.print("Until what? ");
        int r = Integer.parseInt(reader.nextLine());
        
        while (x <= r) {
            sum += x;
            x += 1;
            
        }
        System.out.println("Sum is " + sum);

    }
}
