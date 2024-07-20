package WIthSynchronization;

public class Adder implements Runnable{


    private Count count;

    Adder(Count count) {

        this.count = count;
    }
    @Override
    public void run() {
            for (int i = 1; i <= 100; i++) {
                synchronized (Count.class) {
                count.value += i;
            }
        }
    }
}
