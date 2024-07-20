package WIthSynchronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Count count = new Count(0);
        Adder add = new Adder(count);
        Subtractor subtr = new Subtractor(count);

//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.submit(add);
//        executorService.submit(subtr);

        Thread t1 = new Thread(add);
        Thread t2 = new Thread(subtr);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

//        Future<?> res1 =  executorService.submit(add);
//        Future<?> res2 =  executorService.submit(subtr);
//        res1.get();
//        res2.get();
        System.out.println(count.value);
    }
}
