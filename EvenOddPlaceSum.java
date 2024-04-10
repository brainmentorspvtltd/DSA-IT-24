public class EvenOddPlaceSum {
    public static void main(String[] args) {
        int num = 8765;
        int placeCount = 0;
        int even = 0;
        int odd = 0;
        while(num!=0){
        // get the single digit
        int digit = num % 10;
        placeCount++;
        if(placeCount%2==0){
            even = even + digit;
        }
        else{
            odd = odd + digit;
        }
        // make number small
        num = num /10;
    }
    System.out.println("Even "+even +" Odd "+odd);
    }
}
