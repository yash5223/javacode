public class pattern {
    public static void main(String[] args) {
        String string1;
        string1="121";
        int flag1=0;
        String previous = "";
        String previousvalue="";
        for(int i=string1.length()-1;i>= 0; i--){
            for(int j=0;j<=string1.length()-1;j++){
                if(string1.charAt(j)==string1.charAt(i)){
                    flag1=1;
                    for(int k=Int(string1);k>=0;k--)
                    {
                        previous=Str(k);
                        for(int l=previous.length()-1;l>= 0; l--){
                            for(int m=0;m<=previous.length()-1;m++){
                                if(previous.charAt(j)==previous.charAt(i)){
                                    previousvalue=Str(k);
                                    break;
                                }
                            }}
                    }
                }else{
                    flag1=0;
                }
            }

        }
        if(flag1==1){
            System.out.println("The string is a palindrome");
            System.out.println("The previous palindrome is: " + previous);
        }else{
            System.out.println("The string is not a palindrome");
        }}

    private static String Str(int k) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static int Int(String string1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
