package Threads;

public class PrintHello implements Runnable {

    public int number;
    public PrintHello(int number) {
        this.number = number;
    }

    @Override
    public void run() {
    System.out.println(number+" is printed by "+Thread.currentThread().getName());
//        System.out.println("Hello World is printed by "+Thread.currentThread().getName());
    }
}
