import java.util.Scanner;
public class salary {
    //if salary is greater then 10k then give a bonus 2k but if salary is less then 10k then give abonus of 1k
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        int salary  = sc.nextInt();
        if(salary>10000){
            System.out.println("you will get a bonus of 2000");
        } else {
            System.out.println("you will get a bonus of 1000");
        }
}
}
