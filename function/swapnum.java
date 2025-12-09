public class swapnum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //swap number code
        // int temp = a;
        // a = b;
        // b = temp;
        swap(a,b);
        System.out.println(a + " " + b);

        String name = "gaurav kumar";
        changeName(name);
        System.out.println(name);

    }
    static void changeName(String name){
        name = "radha krishna";
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
