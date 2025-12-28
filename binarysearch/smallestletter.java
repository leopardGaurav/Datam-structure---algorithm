
public class smallestletter {
    public static void main(String[] args) {
        int[] arr = {};
        int target = 14;
        int result = smallestletter(arr, target);
         if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    static int smallestletter(int[] arr, int target){
        if (target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if (target<arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
