public class searchinrange {

    public static void main(String[] args) {
        String name = "gaurav";
        char target = 'a';
        int start = 2;
        int end = 4;

        System.out.println(searchinrange(name, target, start, end));
    }

    static boolean searchinrange(String str, char target, int start, int end) {
        if (str.length() == 0) {
            return false;
        }

        // range safety
        if (start < 0 || end >= str.length() || start > end) {
            return false;
        }

        for (int i = start; i <= end; i++) {
            
            if (str.charAt(i) == target) {
                //System.out.println("Found at index: " + i);
            }
        }
        return false;
    }
}
