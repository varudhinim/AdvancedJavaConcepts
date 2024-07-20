package Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> numbers = List.of(20,45,6,17,33,47,47,66,90);

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(numbers,executorService);

        Future <List<Integer>>FuturedSortedArray = executorService.submit(mergeSorter);
        System.out.println("I am sorted Array"+FuturedSortedArray.get());

    }
}
