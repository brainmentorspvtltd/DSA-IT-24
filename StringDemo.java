public class StringDemo {

    static String reverse(String str){
        // Base case
        if(str.length()==0){
            return "";
        }
        // Small Problem
        // make string small
       String result =  reverse(str.substring(1));
       return result + str.charAt(0);
    }

    static void reverse(char arr[], int left, int right){
        if(left>right){
            return ;
        }
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left+1, right-1);

    }
    public static void main(String[] args) {
        System.out.println(reverse("amit"));
        // char arr[] = new char[4]; // Mutable
        // arr[0] = 'A';
        // arr[1] = 'M';
        // arr[2] = 'I';
        // arr[3] = 'T';
        // reverse(arr, 0, arr.length-1);
        // for(char a: arr){
        //     System.out.print(a);
        // }
        // System.out.println();
        // char array reverse
        // String maintains in a String Pool
        // String a = "Amit";  // Immutable
        // String b = "Amit";
        // String c = "Amit";
        // System.out.println(a == b &&  b== c);
        // a = "Ram";
       // a[0]='X';

    }
}
