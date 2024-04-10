/*
 * Java it is OOP, but it is not 100% OOPS
 * EVERY code start with class
 * class - BluePrint
 * good practice - class name and file name should be same.
 */
class Second{
    /*
     * main it is a function , entry point of every java program
        void - no return 
        static - when class is loaded , then static things loaded along.
    public - access outside the package (folder)
    // JRE - can access main
    String args[] - this is command line argument
     */
   public static void main(String args[]){
        int a = 10; // Value 
        int b = a;
        b++;
        System.out.println(a + " "+b);

    /*
     * out is an object of PrintStream class
     * class PrintStream { print(){}}
     * PrintStream out;
     * System class - build out object
     */
        System.out.println("Hello Java");
    }
}