public class Demo 
{
	static int a=10; // static variable //2
	String s="Ram"; // non static variable //4  --> Data members
	
	public static int m1() // static method //5
	{
		return 100;
	}
	
	public int m2() //non static method //6
	{
		return 200;
	}
	
	static //static block -->Main call
	{
		System.out.println("Static Block");  //1
	}
	
	{ //non static block
		System.out.println("Non static block"); //3
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		Demo d = new
        Demo d = new Demo();
		System.out.println(d.s);
		System.out.println(m1());
		System.out.println(d.m2());		
	}
}