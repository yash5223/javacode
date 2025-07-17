package keystone;

public class Setprioritymethod extends Thread{
	@Override
	public void run() {
		for(;;){
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		Setprioritymethod s=new Setprioritymethod();
		s.setDaemon(true);
		s.start();
		System.out.println(Thread.currentThread().getName());
	}
}
