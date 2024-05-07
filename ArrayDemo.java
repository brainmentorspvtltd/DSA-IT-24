import java.util.ArrayList;

class A{
    int x, y;
}
public class ArrayDemo {
    public static void main(String[] args) {
        A obj = new A();
        // new A();
        // obj - ?
        // obj is a reference variable
        int mark= 90;
        int marks[] = new int[100];
        int []m = new int[100];
        int m2[]= {10,20,30,40,50};
        int m3[] = new int[] {10,20,30,40,50};
        // Array Fixed Size

        // Dynamic Array
        // ArrayList l2 = new ArrayList(); // Not Recommended Way
        // l2.add(10);
        // l2.add(true);
        // l2.add("Hello");
        // Generic List
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
       // l.add("Hi");
        // Default Capacity = 10
        // 50 % Grow
    }
}
