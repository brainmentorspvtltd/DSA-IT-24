public class SearchAndReplace {

    static String searchAndReplace(String str,char search,
     char replace){
        // Base case
        if(str.length()==0){
            return "";
        }
        // Small Problem
        String result=searchAndReplace(str.substring(1), 
        search, replace);
        if(str.charAt(0) == search){
            return replace + result;
        }
        else{
            return str.charAt(0) + result;
        }
    }
    public static void main(String[] args) {
        System.out.println(searchAndReplace("Hello",
         'l', 'x'));
    }
}
