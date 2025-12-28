public class numofevendigit {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // checks if number has even digits
    static boolean even(int num) {
        int digits = countDigits(num);
        return digits % 2 == 0;
    }

    // counts digits of a number
    static int countDigits(int num) {
        if (num == 0) return 1;

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}


//best approach

// public class numofevendigit {

//     public static void main(String[] args) {
//         int[] nums = {12, 345, 2, 6, 7896};

//         Solution sol = new Solution();
//         int result = sol.findNumbers(nums);

//         System.out.println(result);
//     }

//     public int findNumbers(int[] nums) {
//         int count = 0;

//         for (int num : nums) {
//             if (hasEvenDigits(num)) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     private boolean hasEvenDigits(int num) {
//         int digits = 0;

//         if (num == 0) return false; // 0 has 1 digit (odd)

//         while (num > 0) {
//             digits++;
//             num /= 10;
//         }
//         return digits % 2 == 0;
//     }
// }
