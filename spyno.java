package keystone;

import java.util.Scanner;

public class spyno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int product = 1;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        System.out.println(sum == product?num + " is a Spy number.":num + " is NOT a Spy number.");
        sc.close();
    }
}
