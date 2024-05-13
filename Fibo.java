public class Fibo {

    static int fibo(int nthTerm){
        // Base Case
        if(nthTerm<=1){
            return nthTerm;
        }
        // Small Problem
        int term1= fibo(nthTerm-1);
        int term2 = fibo(nthTerm-2);
        return term1 + term2;
    }
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
}
