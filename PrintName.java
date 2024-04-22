class PrintName{
    // Amit Print 5 times (Repeat)
    static void printMyName(int num){
        // Base Case or Termination Case
        if(num ==0){
            // stop the recursion call
            return ; // exit from the function call
        }
        System.out.println("Amit");
        // Always think about small problem
        // 5 --> 4 (num-1)
        // small problem use recursion call
        printMyName(num-1);
    }
    public static void main(String[] args) {
        printMyName(5);
    }
    // static - static things will be load during class loading time
    // loading + linking + execution
   
}