package Threads;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World, The current thread printed by "+ Thread.currentThread().getName());
//        for(int i=0; i<=1000; i++){
////            System.out.println("Hello World, The current thread is "+ Thread.currentThread().getName());
//            System.out.println("Hello World, The current  is "+ i);
//
//        }

        for(int i = 0; i<100; i++) {
            PrintHello ph = new PrintHello(i);
            Thread t1 = new Thread(ph);
            t1.start();
        }
    }
}
