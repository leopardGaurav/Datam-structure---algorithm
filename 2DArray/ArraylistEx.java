
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEx {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);

        // list.add(67);
        // list.add(45);
        // list.add(89);
        // list.add(23);
        // list.add(1,100); // add 100 at index 1
        // System.out.println(list);
        // list.set(0,99);
        // list.remove(2);
        // System.out.println(list);
        
        for(int i=0; i<5; i++){
            list.add(in.nextInt());

        }
        //get item at iany index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));//pass index here
         //list[index] syntx will not work here
        }
        System.out.println(list);
    }
}
