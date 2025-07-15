package keystone;

public class chaining {
    chaining() {
        System.out.println("Constructor called");
    }
    chaining(int a) {
        this("Ram"); // Calling the default constructor
        System.out.println("Parameterized constructor called with value: " + a);
    }
    chaining(String name) {
    	this();//this call statement
        System.out.println("String constructor called with name: " + name);
    }
    public static void main(String[] args) {
        chaining obj = new chaining(10); // This will call the parameterized constructor
    }
}

