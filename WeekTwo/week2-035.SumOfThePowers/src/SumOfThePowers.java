
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

       double x = 2;
       
       System.out.print("Type a number: ");
       int nr = Integer.parseInt(reader.nextLine());
       int sum = 0;
       double y = 0;
       
       while (y <= nr) {
           sum += (int) Math.pow(x, y);
           y++;
       }
        System.out.println("The result is: " + sum);
    }
    
}
