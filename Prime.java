public class Prime {
    public static void main(String[] args) {
        int num = 17;
        int count = 0;
       // for(int i = 1; i<=num; i++){
        // for(int i = 2; i<=Math.sqrt(num); i++){
            for(int i = 2; i*i<=num; i++){
            if(num%i==0){
               System.out.println("Not a Prime Number");
               return ; // exit from the function
            }
        }
        System.out.println("Prime Number");
        //System.out.println(count==2?"Prime Number":"Not Prime Number");
    }
}
