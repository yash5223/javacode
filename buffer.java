
class buffer
{
    static void equals(String string1, String string2)
    {
        System.out.println(string1.equals(string2));
    }
    static void equalss(String string1, String string2)
    {
        System.out.println(string1==string2);
    }
    public static void main (String [] args)
    {
        String string1 = "silent";
        String string2 = "silent";
        equals(string1, string2);
        equalss(string1,string2);
    }
}