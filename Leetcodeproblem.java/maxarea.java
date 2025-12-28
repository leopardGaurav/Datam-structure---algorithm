public class maxarea {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = obj.maxArea(height);
        System.out.println("Maximum Water Stored = " + result);
    }
}

class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxWater = 0;

        while (l < r) {
            int width = r - l;
            int h = Math.min(height[l], height[r]);
            int area = width * h;

            maxWater = Math.max(maxWater, area);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
}

