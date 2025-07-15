class test{

        void m1(int I)
        {
        System.out.println("int argument passed");
        }
        void m1(float I)
        {
        System.out.println("float argument passed");
        }
}
class automaticpromotion extends test{
    public static void main(String[] args)
    {
        automaticpromotion a=new automaticpromotion();
        a.m1(10);
        a.m1(10.5f);
        a.m1('a');
    }
}
