package keystone;

public class exceptionhandling2 {
	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("-------------------");
			System.out.println("Invaild operation");
			System.out.println("-------------------");
			e.printStackTrace(); //this prints the expection error
			System.out.println("-------------------");
			System.out.println("explain"+e.getMessage());
			System.out.println("-------------------");
		}
		finally {//it gets execute always 
			System.exit(0);
			System.out.println("End");
		}
		//nonstatic block
		{
			System.out.println("hello");
		}
		exceptionhandling2 t=new exceptionhandling2();
	}
}
