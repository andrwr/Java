
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        
        
        boolean x = true;
        
        while (x) {
            System.out.print("Enter your password: ");
            String pass = reader.nextLine();
            
            if (pass.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret message is : you are cute babe!");
                break;
            
            }else {
                System.out.println("Wrong");
            }
        }
    }
}