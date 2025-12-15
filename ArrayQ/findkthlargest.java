

class findkthlargest {
    public static void main(String[] args) {
        findkthlargest obj = new findkthlargest();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println("kth largest is : " + obj.findkthlargest(nums,k));
    }
    public int findkthlargest(int[] nums, int k){
        int result = 0;
        for(int i=0;i<k;i++){
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;

            //find maximum
            for(int j=0;j<nums.length;j++){
                if(nums[j]>max){
                    max = nums[j];
                    maxIndex = j;
                }
            }
            result = max;
            nums[maxIndex] = Integer.MIN_VALUE;
        }
        return result;
    }
}
