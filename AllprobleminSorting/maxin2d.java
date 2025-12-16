public class maxin2d {
    public static void main(String[] args) {
        int[][] arr = {
            {18,12,9},
            {14,77,50},
            {1000,2000,3000,4000}
        }; 
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }
    static int[] search(int[][]arr,int target){
        for(int row =0; row< arr.length; row++){
            for(int col =0; col< arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
