public class Fact {
    // 5 * 4 * 3 * 2 * 1
    // Stack Fall
    static int fact(int num){
        if(num ==1 ){
            return num;
        }
        // small problem
        int smallResult  = fact(num - 1);
        return smallResult * num;
    }
    // Stack Building
    static void fact(int num , int result){
        // Base case
        if(num ==1){
            System.out.println(result);
            return;
        }
        // Small Problem
        fact(num-1, num * result);
    }
   public static void main(String[] args) {
    fact(5, 1);
    System.out.println(fact(5));
   } 
}
