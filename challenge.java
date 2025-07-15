class challenge {
    public static void main(String[] args) {
        String string1 = "SIlent";
        Integer Uppercase = 0;
        Integer Lowercase = 0;
        for(int i = 0; i < string1.length(); i++)
        {
            if(Character.isUpperCase(string1.charAt(i)))
            {
                Uppercase++;
            }
            else
            {
                Lowercase++;
            }
        }  
        System.out.println("The no of Uppercase letters is: " + Uppercase);
        System.out.println("The no of Lowercase letters is: " + Lowercase);
}
}