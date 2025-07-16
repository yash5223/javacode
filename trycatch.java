package keystone;
import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        if (b <= 0) {
            System.out.println("Invalid input. Division by zero or negative number is not allowed.");
        } 
        else {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        
        try {
        	System.out.println("Result: " + a/b);
        }
        catch(Throwable ex) {
        	System.out.println("Invalid input: "+ex);
        }
    }
}