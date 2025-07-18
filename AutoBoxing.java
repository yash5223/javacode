package keystone;

public class AutoBoxing {
	public static void main(String[] args) {
		int num = 10;
		Integer i = new Integer(num);  // autoboxing: int -> Integer
		System.out.println("Non Primitive Data type "+i);
		System.out.println("Primitive Data type "+num);
		Integer obj1 = 10;  // autoUnboxing
		int num1 = obj1;
		System.out.println("Autounboxing "+num1);
		
	}
}
