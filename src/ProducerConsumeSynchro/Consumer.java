package ProducerConsumeSynchro;

import java.util.Queue;

public class Consumer implements Runnable{

    private Queue<Object> store;
    private int maxSize;
    private String ConsumerName;

    Consumer(Queue<Object> store, int maxSize, String Consumername){
        this.store = store;
        this.maxSize = maxSize;
        this.ConsumerName = Consumername;
    }
    @Override
    public void run() {
        while(true){
            synchronized(store) {


                if (store.size() > 0) {
                    System.out.println("consumer : " + this.ConsumerName + " has started consuming , store size is " + store.size());
                    store.remove();
                }
            }
        }
    }
}
