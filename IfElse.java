public class IfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        // Nested if else
        if(a>b){ // outer if
            if(a>c){ // inner if
                System.out.println("A is Greater");
            }
            else {
                System.out.println("C is Greater");
            }
        } // outer if close
        else{ // outer else
            if(b>c){
                System.out.println("B is Greater");
            }
            else{
                System.out.println("C is Greater");
            }
        }
    }
}
