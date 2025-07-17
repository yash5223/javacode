package keystone;

public class setMethod implements Runnable{
	@Override
	public void run()
	{
		System.out.println("My thread : through : Runnable Interface");
	}
	public static void main(String[] args) {
		Runnable r=new setMethod();
		Thread t=new Thread(r);
		t.start();
	}
}
