package keystone;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Object> v1 = new HashSet<>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		System.out.println("----------------------");
		System.out.println(v1);
		System.out.println("----------------------");
		System.out.println(v1.size());
		System.out.println("----------------------");
		v1.remove(3);
		System.out.println(v1);
		System.out.println("----------------------");
		System.out.println(v1.contains(2));
		System.out.println("----------------------");
		
		for (Object object : v1) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
		System.out.println("----------------------");
		v1.removeAll(v1);
		System.out.println(v1);
		System.out.println("----------------------");
	}
}
