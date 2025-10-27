package package2;

public class PatternPrinter {
    public static void main(String[] args) {
        System.out.println("=== Pattern Printer ===\n");
        
        // Pattern 1: Right Triangle
        System.out.println("Pattern 1: Right Triangle");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern 2: Pyramid
        System.out.println("Pattern 2: Pyramid");
        for(int i = 1; i <= 5; i++) {
            // Print spaces
            for(int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for(int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern 3: Number Pattern
        System.out.println("Pattern 3: Number Pattern");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}