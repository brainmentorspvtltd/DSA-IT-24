public class FlipDigit {
    public static void main(String[] args) {
        
        int num = 32145;
        int posCount= 0;
        int result = 0;
        while(num!=0){
        int digit = num % 10;
        posCount++;
        int pow = (int)Math.pow(10, digit-1);
        result = result + posCount * pow ;
        num = num /10;    
    }
    System.out.println(result);



    }
}
