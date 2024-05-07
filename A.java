import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class A {
    public static void main(String[] args) {
        List<Integer> l = new CopyOnWriteArrayList<>();
        l.add(10);
        l.add(20);
        // for 1 to 2
        for(Integer x : l){
            l.add(30);
        }

    }
}
