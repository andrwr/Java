
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        
        boolean x = true;
        while (x) {
            System.out.print("Put doubles: ");
            double nr = Double.parseDouble(reader.nextLine());
            
            if ( nr >= - 30.0 && nr <= 40.0) {
                Graph.addNumber(nr);
             }
        }
        
        // Graph is used as follows:
        //Graph.addNumber(7);
       //double value = 13.5;
        //Graph.addNumber(value);
       // value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}