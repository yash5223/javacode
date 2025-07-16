package keystone;

public class log {
    public static void main(String[] args) {
        int x = 10;
        int log = 0;
        int value = 1;

        while (value <= x) {
            value *= 10;
            log++;
        }

        log--; // Go back one step, because it went over

        System.out.println("Approx log10 of " + x + " is: " + log);
    }
}

