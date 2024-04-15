import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int num = 72243;
        // Create a Map to store in a key /value pair
        HashMap<Integer, Integer> map = new HashMap<>();
        while(num!=0){
        // get the one digit
        int digit = num % 10;
        if(map.get(digit)==null){
            map.put(digit, 1);
        }
        else{
            int count= map.get(digit);
            count++;
            map.put(digit, count);
        }
        // make the number small
        num = num /10;
    }
    System.out.println(map);
    }
}
