
public class MultiBranch2 {

    static void fun(int n){
        if(n<=0){
            return ;
        }
        System.out.println("Stack Build... "+n);
        fun(n-1);
        System.out.println("Stack Fall (n-1) "+n);
        fun(n-2);
        System.out.println("Stack Fall (n-2) "+n);
        fun(n-3);
        System.out.println("Stack Fall (n-3) "+n);
    }
    public static void main(String[] args) {
           fun(4);
    }
}
