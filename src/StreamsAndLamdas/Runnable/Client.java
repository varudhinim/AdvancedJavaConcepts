package StreamsAndLamdas.Runnable;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World "+ Thread.currentThread().getName());
//        Runnable r = new Runnable() {
//            public void run() {
//                System.out.println("Hello World "+ Thread.currentThread().getName());
//            }
//        };
//
//

        Runnable r =()->System.out.println("hello I am from the runnable inteface using lamda functions "
                +Thread.currentThread().getName());

        Thread t = new Thread(r);
        t.start();
        // r.run();


        Thread t2 = new Thread(()->System.out.println("hello I am from the thread passing directly lamda functions "
                +Thread.currentThread().getName()));
        t2.start();

    }
}
