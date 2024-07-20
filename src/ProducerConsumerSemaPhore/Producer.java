package ProducerConsumerSemaPhore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Object> store;
    private int maxSize;
    private String producerName;
    private Semaphore ConsumerSemaphore;
    private Semaphore ProducerSemaphore;

    public Producer(Queue<Object> store,int maxSize, String producerName, Semaphore consumerSemaphore, Semaphore producerSemaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.producerName = producerName;
        this.ConsumerSemaphore = consumerSemaphore;
        this.ProducerSemaphore = producerSemaphore;

    }

    @Override
    public void run() {
        while(true){
            try {
                ProducerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Producer " + this.producerName + " has produced the shirt, store size is " + store.size());
            store.add(new Object());
            ConsumerSemaphore.release();
        }
    }
}
