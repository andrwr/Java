
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        
        int x,y;
        System.out.print("First: ");
        x = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        y = Integer.parseInt(reader.nextLine());
        
        while (x <= y) {
            System.out.println(x);
            x++;
        }

    }
}
