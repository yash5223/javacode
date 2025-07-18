package keystone;
import java.util.LinkedList;
import java.util.Vector;
public class generic {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<>();
		l1.add("Ram");
		l1.add("100");
		l1.add(null);
		l1.add("10.5");
		//System.out.println(l1);
		
		Vector v1=new Vector();
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
			System.out.print(object+" ");
		}
	    
	}
}
