package keystone;



public class unknown extends Object {
	int id;
	unknown(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	@Override
	public boolean equals(Object obj)//Object obj -->upcasted
	{
		unknown e=(unknown)obj;//Down casted 
		return this.id==e.id;
	}
	public static void main(String[] args) {
		unknown e1=new unknown(10);
		unknown e2=new unknown(10);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
	}
}
