import java.util.Arrays;

public class nextPermutation {

    public static void main(String[] args) {
        nextPermutation sol = new nextPermutation();

        int[] nums = {1, 2, 3};   // test input
        sol.nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: pivot find karo
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: just larger element dhundo
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: right part reverse karo
        reverse(nums, i + 1, n - 1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
