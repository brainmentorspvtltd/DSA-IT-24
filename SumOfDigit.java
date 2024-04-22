public class SumOfDigit {

    // Stack Fall
    static int sumOfDigit(int num){
        if(num == 0){
            return 0; // sum initialize with 0
        }
        // how sum initialize with 0
        //int sum  = 0; // Base case
        int sum = sumOfDigit(num/10); // Small Problem (Recursion)
        return sum  + num % 10;
    }

    // Stack Building (Arguments + Logic Before call)
    // num and sum are local variables
    static void sumOfDigit(int num , int sum){
        if(num == 0){
            System.out.println(sum);
            return ;
        }
        // 2. Base case
        // 1. Small Problem + recursion call + stack 
        // 3. Processing Logic
        sumOfDigit(num/10, sum + num % 10 );
    }
    public static void main(String[] args) {
       // sumOfDigit(123, 0);
       int sum = sumOfDigit(123);
       System.out.println(sum);
    }
}
