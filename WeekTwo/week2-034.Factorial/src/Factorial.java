import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int x = 1;
        System.out.print("Type a number: ");
        int nr = Integer.parseInt(reader.nextLine());
        int sum = 1;
        
        while (x <= nr) {
            sum *= x;
            x++;
        }
        
        System.out.println("Factorial is: "+ sum);

    }
}
