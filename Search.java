public class Search {
    static boolean search(int arr[], int index, 
    int searchElement){
        // Base Case
        if(index == arr.length){
            // Array Exhaust
            return false; // Element not found
        }
        if(arr[index]== searchElement){
            return true; // ELement Found
        }
        // Small Problem
        return search(arr, index + 1, searchElement);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,100};
        int searchElement = 150;
        boolean result = search(arr, 0, searchElement);
        System.out.println(result?"Found":"Not Found");
    }
}
