package keystone;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int result = 0;

        int n = String.valueOf(num).length(); // count digits

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }
        System.out.println(result == original?original + " is an Armstrong number.":original + " is not an Armstrong number.");
    }
}
