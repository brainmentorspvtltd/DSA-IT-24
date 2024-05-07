public class Sorted {
    static boolean isSorted(int arr[], int index){
        // Base Case (Index reach to the last element)
        if(index == arr.length-1){
            return true; // array is sorted
        }
        // Negative Case
        if(arr[index]>arr[index+1]){
            // Not Sorted
            return false;
        }
        // Small Problem
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        boolean result = isSorted(arr, 0);
        System.out.println(result?"Sorted":"Not Sorted");
    }
}
