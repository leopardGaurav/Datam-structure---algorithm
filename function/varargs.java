import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun();
        multiple(2,3,"gaurav","radha");
    }
    static void multiple(int a, int b , String...v){
        
    }


    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
//...v means a method parameter that can take 
//unlimited values, stored as an array.
