package keystone;
//check exception or complie time exception
public class checkandcompiletime {
	static void m1() throws InterruptedException{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
	public static void main(String[] args) {
		try {
			m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//1st type call
	}
}
