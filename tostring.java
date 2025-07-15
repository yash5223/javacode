package keystone;

public class tostring {
    String name;//Global,non static,instance,data member,reference

    // Constructor
    public tostring(String name) {
        this.name = name;
    }

    // This method overrides Object's toString()
    @Override
    public String toString() {
        return this.name; // Only returns the parameter
    }

    public static void main(String[] args) {
        tostring s1 = new tostring("Tom");
        tostring s2 = new tostring("Jerry");
        System.out.println(s1);           // Output: Tom
        System.out.println(s2.toString()); // Output: Jerry
    }
}
