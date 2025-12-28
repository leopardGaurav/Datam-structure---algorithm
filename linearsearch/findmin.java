public class findmin {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
