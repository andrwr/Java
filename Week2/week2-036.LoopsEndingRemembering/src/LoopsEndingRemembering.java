import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int x = 0;
        int counter = 0;
        int sum = 0;
        double average = 0.0;
        int even = 0;
        int odd = 0;
        //System.out.print("Type numbers: ");
        //x = Integer.parseInt(reader.nextLine());
        
        /*while (x != -1) {
            sum += x;
            System.out.print("Type numbers: ");
            x = Integer.parseInt(reader.nextLine());
            counter++;
        
        }
                */
        while (true) {
            
            System.out.print("Type numbers: ");
            x = Integer.parseInt(reader.nextLine());
            if (x != -1) {
                sum += x;
                counter++;
                if (x % 2 == 0) {
                    even++;
                } else odd++;
                
                
            } else {
                break;
            }
            
        
        }
        
        average = (double) sum / counter;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: "+ counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
