package ArrayQ;

public class storing {
    public static void main(String[] args) {
        // Q :  store a rioll number
        int a = 2;

        // Q : store a person's name
        String name = "radhe krishna";

        //Q : store 5 roll numbers
        int rno1 =1;
        int rno2 =2;
        int rno3 =3;    
        int rno4 =4;
        int rno5 =5;
        //similarly if we need to store 2k rollnumber then 
        // it will be very difficult to store and manage
        // to overcome this problem we have arrays in java

        //Array  : is a container which can store multiple values of same data type
        // it is collection of multiple datatyes

        //syntax: 
        //datatype[] variable_name = new datatype[size];

        //now store 5 number using array
        int[] rnos = new int[5];
        //or directly
        int[] rnos2 = {1,2,3,4,5};

        String[] names = new String[3];
        //or directly
        String[] names2 = {"radhe","krishna","govind"};

       // but we can't mixing of datatypes in array
       // int[] mix = {1,2, "radhe"}; 

       int[] ros; //declaration of array. ros is getting defined in the stack memory
       ros = new int[5]; //initialization of array. memory is getting allocated in heap memory    }

       String[] arr = new String[4];
       System.out.println(arr[0]); //default value is null
}
