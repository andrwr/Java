
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guess = 0;
        while(true) {
            
            System.out.print("Guess a number: ");
            int x = Integer.parseInt(reader.nextLine());
            guess++;
            if (numberDrawn == x) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (x < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guess);
            } else if (x > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guess);
            }
           
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
