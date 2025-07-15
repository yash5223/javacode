package keystone;

public class JohnDon {
	int num;
	public JohnDon(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
	}
	@Override
	public int hashCode()
	{
		return this.num;
	}
	public static void main(String[] args) {
		JohnDon don=new JohnDon(50);
		JohnDon don2=new JohnDon(100);
		System.out.println(don);
		System.out.println(don2.hashCode());
		
		
	}
}
