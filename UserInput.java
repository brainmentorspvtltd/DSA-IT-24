import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Input Ways?
        // Command Line Arguments (String[] args)
        // System.in
        // Scanner - Buffer
        int count = 0;
        //Scanner s = new Scanner(new File());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        // nextXXX
        // nextLine
        // Scanner scanner = new Scanner("Hello How are You\n I am Good\n");
        // // while(scanner.hasNext()){
        // //     count++;
        // //     System.out.println(scanner.next());
        // // }
        // while(scanner.hasNextLine()){
        //     System.out.println(scanner.nextLine());
        //     count++;
        // }
        // System.out.println(count);
        scanner.close();

    }
}
