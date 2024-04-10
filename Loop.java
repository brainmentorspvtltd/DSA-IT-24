public class Loop {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;

        // put the logic in a loop
        while(num!=0){
        // Reminder
        int rem = num % 10;
        // store the number
        sum = sum + rem;
        // divide the number to make it small
        num = num /10;
        }
        System.out.println(sum);


    }
}
