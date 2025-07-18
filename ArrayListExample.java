package keystone;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add("hello");
        numbers.add(30);

        // For-each loop
        for (Object object : numbers) {
            System.out.println(object);
        }
    }
}
