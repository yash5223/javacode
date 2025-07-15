package keystone;


public class primesingleton {
	private static primesingleton p=null;
	private primesingleton(){
		System.out.println("object create");
	}
	public static void m1(){
		if(p==null){
			p=new primesingleton();
		}
		else {
			System.out.println("object already exist");
		}
	}
}

class count
{
	count()
	{
		primesingleton.m1();
	}
}