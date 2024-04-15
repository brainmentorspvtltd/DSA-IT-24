public class PrintDigit {
    public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        int count = 0;
        int power = 0;
        // Count Digit
        while(copy!=0){
        copy/=10; // copy = copy / 10;
        count++;
        }
        while(num!=0){
        power = (int)Math.pow(10, count-1); 
        System.out.println(num/power);
        num = num % power;
        count--;
        }
    }
}
