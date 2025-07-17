package keystone;

import java.util.Scanner;

public class PrefectNumber extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No To Check:- ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        System.out.println(num == sum ? "Perfect Number" : "Not Perfect Number");
    }
}
