package ArrayQ;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr  = new int[5];
        arr[0]= 23;
        arr[1]= 45;
        arr[2]= 67; 
        arr[3]= 89;
        arr[4]= 12;
        System.out.println(arr[3]);
        //input using for loops
        for(int i = 0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
// for each loop
        for(int num: arr){
            System.out.print(num + " ");
        }
        //for(Type variable : collection/array){
        // code
        //}

        //if index value is 4 and we try to access 7th index
       // System.out.println(arr[7]); //ArrayIndexOutOfBoundsException

       System.out.println(Arrays.toString(arr));
       //.toString(arr) = array ke saare elements ko 
       //ek readable string me convert karta hai
       //Format: [element1, element2, element3, ...]
    }
}
