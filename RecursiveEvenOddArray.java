public class RecursiveEvenOddArray {

    static int [] fillEvenOddInArray(int n ){
        // Base Case
        if(n==0){
            return new int[2];
        }
        int result[] = fillEvenOddInArray(n-1); // Small Problem
        if(n%2==0){
            result[0] =  result[0] + 1;
        }
        else{
            result[1] = result[1] +1;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 100;
        int r [] =fillEvenOddInArray(n);
        System.out.println("Even Count "+ r[0]);
        System.out.println("Odd Count "+r[1]);
    }
}
