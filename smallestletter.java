public class smallestLetter {
    public static void main(String[] args) {
        char[] arr = {'b','c','f','h'};
        char target = 'a';

        char result = nextGreatestLetter(arr, target);
        System.out.println(result);
    }

    static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // wrap around case
        return arr[start % arr.length];
    }
}
