package keystone;

public class smallestlargestno {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 4, 5, 6};
        int firstlastInteger = arr[0] + arr[arr.length - 1];
        int additionno = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            additionno = additionno + arr[i];
        }
        if (firstlastInteger == additionno) {
            System.out.println("They both are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}