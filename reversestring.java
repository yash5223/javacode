//reversestring.java
// This program reverses a given string
class reversestring {
    public static void main(String[] args) {
        String str = "hello world";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        System.out.println(reversedStr);
    }
}