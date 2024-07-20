package Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        // it has thread pool with 10 threads
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // it has single threat pool
//        ExecutorService ex = Executors.newSingleThreadExecutor();
//        // it will create the thread pool dynamically based on the workload
//        ExecutorService ex1= Executors.newCachedThreadPool();
//        // Creates a pool of threads that can schedule commands to run after a given delay or to execute periodically.
//        ExecutorService ex2= Executors.newScheduledThreadPool(5);
//        // it creates the thread poo, for which it steals the work from other to balance the workload
//        ExecutorService ex3 = Executors.newWorkStealingPool();

        for(int i = 0; i < 100; i++){
            if(i==5 || i==10 || i==99 ){
                System.out.println("Debugg");
            }
            NumberPrint numberPrint = new NumberPrint(i);
            executorService.execute(numberPrint);
        }
//        ExecutorService ex4= Executors.newFixedThreadPool(1);
//        NumberPrint numberPrint = new NumberPrint(2);
//        ex4.execute(numberPrint);
    }
}
