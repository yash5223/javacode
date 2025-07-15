package keystone;

public class newvalues {
    public static void main(String[] args) {
        int num = 823456;
        int temp = num;
        int lastDigit = temp % 10;
        int digitCount = 0;
        int reverse = 0;
        //mod10 gives last digit from big no
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;//used to reverse the list
            temp /= 10;//used to remove elements from the list
            digitCount++;
        }
        int firstDigit = reverse % 10;
        int firstLastSum = firstDigit + lastDigit;
        temp = num / 10;
        int middleSum = 0;
        for (int i = 1; i < digitCount - 1; i++) {
            int digit = temp % 10;
            middleSum += digit;
            temp /= 10;
        }
        System.out.println(firstLastSum == middleSum ? "They both are equal" : "They are not equal");//conditional statement
        if (firstLastSum == middleSum) {
            System.out.println("They both are equal zyllo");
        } else {
            System.out.println("They are not equal");
        }
    }
}

