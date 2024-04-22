public class PrintDigitRec {

    static void printDigit(int num){
        // Base case
        if(num ==0){
            return ;
        }
        // small problem
        printDigit(num/10); // make number small
        System.out.println(num%10);
    }
    public static void main(String[] args) {
        int num = 12345;
        printDigit(num);
    }
}
