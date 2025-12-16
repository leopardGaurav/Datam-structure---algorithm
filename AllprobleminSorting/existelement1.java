
public class existelement1 {
    public static void main(String[] args) {
        int arr[] = {18,12,9,14,77,50};
        int target = 14;
        System.out.println("Element exist : " + elementexist(arr,target));
    }

    public static boolean elementexist(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}

