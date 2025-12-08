import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();

        switch(empid){
            case 1:
                System.out.println("gaurav kumar");
                break;
            case 2:
            System.out.println("krishna");
                break;
            case 3:
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "CSE":
                        System.out.println("CSE department");
                        break;
                    default:
                        System.out.println("No department found");
                }
            default:
                System.out.println("Enter valid employee id");
        }
    }
}
