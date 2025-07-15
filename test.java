import java.util.Scanner;
public class EncapsulationExample {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    public static void main(String[] args) {
        EncapsulationExample person = new EncapsulationExample();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        person.setName(scanner.nextLine());

        System.out.print("Enter your age: ");
        person.setAge(scanner.nextInt());

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        scanner.close();
    }
}