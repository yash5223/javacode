package keystone;
import java.util.Scanner;

public class scannerpalindrome {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		String str1;
		System.out.println("Enter the string");
		str1=inputScanner.nextLine();
		str1.toLowerCase();
		Integer flag=0;
		if(str1.charAt(1)==str1.charAt(str1.length()-2))//we can use equals built in function
		{
			flag=1;
		}
		System.out.println("WE FOUND THAT BOTH CHARACTERS ARE SAME");
	}
}
