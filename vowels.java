class vowels{
    public static void main(String[] args) {
        String str1="Hello";
        char[] vowels={'a','e','i','o','u'};
        Integer vowelscount=0,consonents=0;
        for (int i=0;i<str1.length();i++) {
            char ch=Character.toLowerCase(str1.charAt(i));
            for(int j=0;j<vowels.length;j++) {
                if(ch==vowels[j])
                {
                    vowelscount++;
                }

        }
        }
        consonents=str1.length()-vowelscount;
        System.out.println("count of vowels is "+vowelscount);
        System.out.println("count of consonents is "+consonents);
    }
}