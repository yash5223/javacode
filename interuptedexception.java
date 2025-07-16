package keystone;

import java.util.Scanner;
//this is used to create custom exception
public class interuptedexception {
	public static void main(String[] args) throws abc{
		int pswd=23434;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:- ");
		if(sc.nextInt()==pswd)
		{
			System.out.println("login");
		}
		else {
			abc obj=new abc();
			 throw obj;
		}
	}
}
