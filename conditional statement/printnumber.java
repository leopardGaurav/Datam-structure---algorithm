
import java.util.Scanner;

public class printnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        for (int i = 1; i <=number; i++) {
            if(number<=5 && number>=1){
                System.out.println("number is : " +i);
            }
        }
    }
}
