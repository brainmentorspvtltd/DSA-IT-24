public class RopeCutProblem {

    static int ropeCut(int ropeLen , int a, int b , int c){
        // Base case
        if(ropeLen ==0 ){
            return 0;
        }
        if(ropeLen<0){
            return -1;
        }
        int option1 = ropeCut(ropeLen-a, a, b, c);
        int option2 = ropeCut(ropeLen-b, a, b, c);
        int option3 = ropeCut(ropeLen-c, a, b, c);
        int r = Math.max(Math.max(option1, option2),option3);
        if(r==-1){
            return -1;
        }
        return r + 1;
    }
    public static void main(String[] args) {
        int ropeLen = 5;
        int a = 2;
        int b = 5;
        int c = 1;
        int r = ropeCut(ropeLen, a, b, c);
        System.out.println(r);
    }
}
