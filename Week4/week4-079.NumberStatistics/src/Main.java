import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        System.out.print("Type numbers: ");
        int input = Integer.parseInt(reader.nextLine());
        
        while(true) {
            if(input == -1) {
                System.out.println("Sum is equal to: " + all.sum());
                System.out.println("Sum of even numbers: " + even.sum());
                System.out.println("Sum of odd numbers: " + odd.sum());
                break;
            }
            if(input % 2 == 0) {
                even.addNumber(input);
            }else {
                odd.addNumber(input);
            }
            
            all.addNumber(input);
            System.out.print("Type another number: ");
            input = Integer.parseInt(reader.nextLine());
            
            
        }
     
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    }
}
