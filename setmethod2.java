package keystone;

public class setmethod2 extends Thread{
	    public setmethod2(String name) {
	    	super(name);
	    }
		@Override
		public void run()
		{
			System.out.println(Thread.currentThread().getName()+" Priority - "+Thread.currentThread().getPriority());
		}
		public static void main(String[] args) {
			setmethod2 r=new setmethod2("Rohan");
			setmethod2 r1=new setmethod2("Sagar");
			setmethod2 r2=new setmethod2("Suraj");
			setmethod2 r3=new setmethod2("Om");
			r.setPriority(1);
			r1.setPriority(2);
			r2.setPriority(3);
			r3.setPriority(4);
			r.start();
			r1.start();
			r2.start();
			r3.start();
		}
}
