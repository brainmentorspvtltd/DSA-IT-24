import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows");
        int n = scanner.nextInt();
        
        for(int row = 1; row<=n ; row++){
            for(int space = 1; space<=n - row; space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=row; star++){
                System.out.print("*");
            }
            System.out.println();

        }
        scanner.close();
        
    }
}
