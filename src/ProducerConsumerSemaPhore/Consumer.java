package ProducerConsumerSemaPhore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Object> store;
    private int maxSize;
    private String ConsumerName;
    private Semaphore ConsumerSemaphore;
    private Semaphore ProducerSemaphore;


    Consumer(Queue<Object> store, int maxSize, String Consumername, Semaphore consumerSemaphore, Semaphore producerSemaphore){
        this.store = store;
        this.maxSize = maxSize;
        this.ConsumerName = Consumername;
        this.ConsumerSemaphore = consumerSemaphore;
        this.ProducerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        while(true){
            try {
                ConsumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("consumer : " + this.ConsumerName + " has started consuming , store size is " + store.size());
            store.remove();
            ProducerSemaphore.release();
        }
    }
}
