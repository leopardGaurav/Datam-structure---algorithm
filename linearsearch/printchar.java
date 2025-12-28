import java.util.Arrays;

public class printchar {
    public static void main(String[] args) {
        String name = "gaurav";
        printchars(name);
    }

    static void printchars(String str) {
    char[] arr = new char[str.length()];

    for (int i = 0; i < str.length(); i++) {
        arr[i] = str.charAt(i);
    }

    System.out.println(Arrays.toString(arr));
}

}
