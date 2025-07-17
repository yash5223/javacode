package keystone;

import java.util.Scanner;

public class OddEven extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check odd / even :- ");
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "Even Number" : "Odd Number");
    }
}
