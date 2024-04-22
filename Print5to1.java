public class Print5to1 {
    // 5 to 1
    static void printNumber(int num){
        // base case
        if(num ==0){
            return ; // return to the last call
        }
        // System.out.println(num); // Logic to print
        // small problem
        System.out.println("SB "+num); 
        // code written before fn call is used during stack build
        printNumber(num-1); // Recursive call
        // code written after fn call is used during stack fall
       // System.out.println("SF "+num); 
    }
    public static void main(String[] args) {
        // call
        printNumber(5);
    }
}
