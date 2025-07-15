//Printing Buzz Instead of 5's Multiple
public class challenges {
 public static void main(String[] args) {
    int[] a = {2, 7,7,4,8};
    for (int i = 0; i < a.length - 1; i++) {
        for(int j=i+1; j < a.length; j++) {
            if ((a[j]+ a[j + 1]) == 9) {
                System.out.println("a[i]: " + a[j] + ", a[i+1]: " + a[j + 1]);
            }
        }
    }
 }   
}
