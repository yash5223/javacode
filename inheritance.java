// inheritance.java
// This class is used for inheritance demonstration
class parent{
    void displayparent()
    {
        System.out.println("Thise is Parent class");
    }
}
class inheritance extends parent{
    void displaychild()
    {
        System.out.println("This is Child class");
    }
    public static void main(String[] args) {
        inheritance obj1=new inheritance();
        obj1.displayparent();
        obj1.displaychild();
    }
}