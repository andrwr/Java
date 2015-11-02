import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random r = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        while(numbers.size() < 7) {
            int x = 1 + r.nextInt(39);
            if(!containsNumber(x)) {
                numbers.add(x);
            }
        }
        
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        
        if (!numbers.contains(number)) {
            return false;
        }
        
        return true;
    }
}
