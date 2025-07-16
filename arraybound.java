package keystone;

public class arraybound {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        System.out.println("Start Connection");
        try {
            System.out.println(a[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        }
        finally {
			System.out.println("Connection close");
		}
    }
}
