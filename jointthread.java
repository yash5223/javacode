package keystone;

public class jointthread {
    public static void main(String[] args) throws InterruptedException {
        PrefectNumber obj1 = new PrefectNumber();
        OddEven obj2 = new OddEven();

        obj1.start();
        obj1.join();
        obj2.start();
    }
}
