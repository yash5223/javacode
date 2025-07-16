package keystone;

import java.util.Scanner;

public class perfectno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String fact ="";
        Integer sum=0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0 && num!=i) { 
                fact=fact+i;
            }
        }
        for(int j=0;j<=fact.length()-1;j++)
        {
        	sum += Character.getNumericValue(fact.charAt(j));
        }
        System.out.println((num==sum)?"they both are equal":"they both are not equal");
        sc.close();
    }
}
