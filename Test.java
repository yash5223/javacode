package keystone;

import java.util.Scanner;

public class Test extends Thread{
	@Override
	public void run() {
		System.out.println("My First Thread - "+Thread.currentThread().getName());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start:- ");
		int s=sc.nextInt();
		System.out.println("Enter End:- ");
		int e=sc.nextInt();
		while(s<=e)
		{
			try {
				Thread.sleep(3);
			}catch(InterruptedException e1)
			{
				e1.printStackTrace();
			}
			System.out.println(s);
			s++;
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Main thread Name :- "+Thread.currentThread().getName());
		Test t=new Test();
		t.start();
	}
	
}
