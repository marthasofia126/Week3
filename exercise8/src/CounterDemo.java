
public class CounterDemo {
    public static void main(String[] args) {
        Counter first = new Counter();
        Counter second = new Counter();

        first.value = 2;
        second.value = 8;

        first.addOne();
        second.addOne();
        second.addOne();

        System.out.println("First: " + first.value);
        System.out.println("Second: " + second.value);
    }
}

