public class max {
    public static void main(String[] args){
        int[] arr = {1,3,23,9,18};
        System.out.println(maxVal(arr));
    }

    static int maxVal(int[] arr){
        int maxVal = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
