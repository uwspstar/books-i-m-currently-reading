public class Counter {
    private int counter; // default is 0
    private final String name;

    public String toString() {
        return counter + " " + name;
    }

    public int tally() {
        return counter;
    }

    public Counter(String id) {
        name = id;
    }

    public void increment() {
        counter++;
    }

    public int GetCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter("ones");
        Counter c2 = c1;

        System.out.println(c1); // Counter@251a69d7
        System.out.println(c2); // Counter@251a69d7

        c1.increment();
        System.out.println("c1 counter is " + c1.GetCounter()); // 1

        c2.increment();
        System.out.println("c2 counter is " + c2.GetCounter()); // 1

        System.out.println(c1); // Counter@251a69d7
        System.out.println(c2); // Counter@251a69d7
        System.out.println("c1 counter is " + c1.GetCounter()); // 2
        System.out.println("c2 counter is " + c2.GetCounter()); // 2

        c2.increment();
        System.out.println("c1 counter is " + c1.GetCounter()); // 3
        System.out.println("c2 counter is " + c2.GetCounter()); // 3

        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        heads.increment();
        heads.increment();
        tails.increment();
        System.out.println(heads + " " + tails); // 2 heads 1 tails
        System.out.println(heads.tally() + tails.tally()); // 3

    }

}
