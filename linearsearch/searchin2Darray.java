public class searchin2Darray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        System.out.println(searchIn2DArray(matrix, target));
    }
    static boolean searchIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
          //first loop for row and 2nd loop for column always

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Found at position: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }
}
