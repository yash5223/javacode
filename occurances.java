public class occurances {
    public static void main(String[] args) {
        String string3 = "Pratap";
        String string1 = string3.toLowerCase();
        String string2 ="";
        int count = 0;
        for(int i = 0; i<=string1.length()-1; i++) {
            char currentChar = string1.charAt(i);
            for (int j = 0; j < string1.length(); j++) {
                if (currentChar == string1.charAt(j)) {
                    count++;
                }
            }
            if(count>1){
                if (string1.indexOf(currentChar) == i) {
                    string2 = "The character " + currentChar + " occurs " + count + " times.";
                    System.out.println(string2);
                }
            }
            count=0;
        }
    }
}
