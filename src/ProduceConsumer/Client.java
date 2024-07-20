package ProduceConsumer;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ArrayDeque<>();

        int maxSize = 10;

        Consumer consumer1 = new Consumer(store, maxSize, "consumer1");
        Producer producer1 = new Producer(store, maxSize,"producer1");

        Consumer consumer2 = new Consumer(store, maxSize, "consumer2");
        Producer producer2 = new Producer(store, maxSize,"producer2");

        Consumer consumer3 = new Consumer(store, maxSize, "consumer3");
        Producer producer3 = new Producer(store, maxSize,"producer3");

        Consumer consumer4 = new Consumer(store, maxSize, "consumer4");
        Producer producer4 = new Producer(store, maxSize,"producer4");

        Thread t1 = new Thread(producer1);
        t1.start();

        Thread t2 = new Thread(producer2);
        t2.start();

        Thread t3 = new Thread(producer3);
        t3.start();

        Thread t4 = new Thread(producer4);
        t4.start();

        Thread t5 = new Thread(consumer1);
        t5.start();

        Thread t6 = new Thread(consumer2);
        t6.start();

        Thread t7 = new Thread(consumer3);
        t7.start();

        Thread t8 = new Thread(consumer4);
        t8.start();



    }
}
