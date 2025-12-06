
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter operator(+,-,*,/)");
            char op = sc.next().trim().charAt(0);
            //exit condition
            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("Enter two numbers: ");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                double result = 0;

                if(op == '+'){
                    result = num1 + num2;
                } else if(op == '-'){
                    result = num1 - num2;
                } else if(op == '*'){
                    result = num1 * num2;
                } else {
                    if(num2 != 0){
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                }
                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid operator. Exiting...");
        }
        sc.close();
     }
    }
}