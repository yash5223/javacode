//palindrome
class palindrome{
    public static void main(String[] args) {
        String str1="Madam";
        Integer flag1=0;
        str1=str1.toLowerCase();
        for (int i=0;i<=str1.length()-1;i++) {
            for(int j=str1.length()-1;j>=0;j--){
                if(str1.charAt(i)==str1.charAt(j)){
                    flag1=1;
                }
                else{
                    flag1=0;
                }
            }    
        }
        if(flag1==1){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}