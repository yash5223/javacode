package keystone;

public class Singleton {
	private Singleton()
	{
		System.out.println("Singleton class");
	}
	public static void m1()//Helper method
	{
		Singleton b=new Singleton();
	}
}
