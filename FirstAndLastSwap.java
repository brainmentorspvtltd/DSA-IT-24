public class FirstAndLastSwap {
    public static void main(String[] args) {
        int num = 7243;
        int copy = num;
        int count = 0;
        // Count the Digits
        while(copy!=0){
        copy = copy / 10;
        count++;
        }
        // last digit
        int lastDigit = num % 10;
        int power = (int)Math.pow(10, count-1);
        int firstDigit  = num / power;
        int mid = num / 10;
        mid = mid % (int)Math.pow(10, count - 2);
        int result = lastDigit * power + mid * 10 + firstDigit;
        System.out.println(result);
        //System.out.println(firstDigit +" "+lastDigit);
    }
}
