package ProducerConsumerSemaPhore;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();

        int maxSize = 10;

        Semaphore producerSemaphore = new Semaphore(maxSize);
        Semaphore consumerSemaphore = new Semaphore(0);


        Consumer consumer1 = new Consumer(store, maxSize, "consumer1", consumerSemaphore, producerSemaphore);
        Producer producer1 = new Producer(store, maxSize,"producer1", consumerSemaphore, producerSemaphore);

        Consumer consumer2 = new Consumer(store, maxSize, "consumer2",consumerSemaphore, producerSemaphore);
        Producer producer2 = new Producer(store, maxSize,"producer2", consumerSemaphore, producerSemaphore);

        Consumer consumer3 = new Consumer(store, maxSize, "consumer3",consumerSemaphore, producerSemaphore);
        Producer producer3 = new Producer(store, maxSize,"producer3", consumerSemaphore, producerSemaphore);

        Consumer consumer4 = new Consumer(store, maxSize, "consumer4",consumerSemaphore, producerSemaphore);
        Producer producer4 = new Producer(store, maxSize,"producer4", consumerSemaphore, producerSemaphore);

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
