
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("name: ");
            String nameInput = input.nextLine();
            if (!nameInput.equals("")){
                System.out.print("number: ");
                String numberInput = input.nextLine();
                list.add(new Student(nameInput, numberInput));
            } else break;
          }
        System.out.println("");
        
        for(Student stu: list) {
            System.out.println(stu);
        }
        
        System.out.print("Give search term: ");
        String searchString = input.nextLine();
        System.out.println("Result:");
        
        for (Student std1 : list) {
            if (std1.getName().contains(searchString)) {
                System.out.println(std1);
            }
        }
        
        
        
        
    }
}