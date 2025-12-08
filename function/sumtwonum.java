
import java.util.Scanner;
public class sumtwonum {
    public static void main(String[] args){
        sumof();
        // Scanner in =  new Scanner(System.in);
        // int num1,num2,sum;
        // System.out.print("Enter first number: ");
        // num1 = in.nextInt();
        // System.out.print("Enter second number: ");
        // num2 = in.nextInt();
        // sum = num1 + num2;
        // System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

    }
    static void sumof(){
        Scanner in =  new Scanner(System.in);

        int num1,num2,result;

        System.out.print("Enter first number: ");
        num1 = in.nextInt();

        System.out.print("Enter second number: ");
        num2 = in.nextInt();

        result = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        }

}
