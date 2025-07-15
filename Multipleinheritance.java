package keystone;
interface Car{
	void cartype();
}
interface Truck{
	void Trucktype1();
}
interface Bus{
	void Bustype();
}
interface Bike{
	void Biketype();
}
public class Multipleinheritance implements Car,Truck,Bus,Bike {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1=new Multipleinheritance();
		obj1.cartype();
		((Truck) obj1).Trucktype1();
		((Bus) obj1).Bustype();
		((Bike) obj1).Biketype();
	}
	public void cartype() {
		System.out.println("This is a Car with 4 Passangers");
	}
	@Override
	public void Biketype() {
		// TODO Auto-generated method stub
		System.out.println("This is a Bike used for off Roading");
	}
	@Override
	public void Bustype() {
		// TODO Auto-generated method stub
		System.out.println("This is a Public Bus");
	}
	@Override
	public void Trucktype1() {
		System.out.println("This Truck can carry heavy load");		
	}
}
