public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
       while (amount > 0) {
           System.out.print("*");
           amount--;
       }
       System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        
        int x = size;
        int s = size - 1;
        while(s >= 0) {
            printWhitespaces(s);
            printStars(x - s);
            s--;
        }
        
        
    }

    public static void xmasTree(int height) {
        // 40.3
        int h = height;
        int base = 2;
        int c = h - 1;
        int p = 0;
        
        while (c >= 0) {
            
            printWhitespaces(c);
            printStars(h - c + p);
            p++;
            c--;
            
        }
        int b1 = height - 2;
        while (base > 0) {
            printWhitespaces(b1);
            printStars(3);
            base--;
        }
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
