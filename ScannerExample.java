public class ScannerExample {
    public static void main(String[] args) {
        String string1;
        string1 = "123";
        Integer flag1 = 0;
        String previous="";
        int num = Integer.parseInt(string1);
        for(int k=num-1;k>=0;k--)
        {
            previous= String.valueOf(k);
            for(int i=previous.length()-1;i>= 0; i--){
                for(int j=0;j<=previous.length()-1;j++){
                    if(previous.charAt(j)==previous.charAt(i)){
                        flag1=1;
                    }else{
                        flag1=0;
                    }
                }
            }
            if(flag1==1){
                System.out.println("The Previous palindrome"+" "+previous);
                break;
            }
        }
    }
}