package ProduceConsumer;

import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Object> store;
    private int maxSize;
    private String producerName;

    public Producer(Queue<Object> store,int maxSize, String producerName) {
        this.store = store;
        this.maxSize = maxSize;
        this.producerName = producerName;

    }

    @Override
    public void run() {
        while(true){
            if(store.size() < maxSize){
                System.out.println("Producer " + this.producerName + " has produced the shirt, store size is " + store.size());
                store.add(new Object());
            }
        }
    }
}
