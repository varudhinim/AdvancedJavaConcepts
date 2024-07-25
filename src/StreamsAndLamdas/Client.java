package StreamsAndLamdas;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        // SampleFunctionalInterface sampleFunctionalInterface = new SampleFunctionalInterface()
        // java doesn't allow to creat object of interface because the interface is incomplete

        // 1 process
        SampleClass sampleClass = new SampleClass();
        sampleClass.fun();

        //2 process
        SampleFunctionalInterface sampleFunctionalInterface = new SampleFunctionalInterface() {
            @Override
            public void fun() {
                System.out.println("fun implemented in main");
            }
        };
        sampleFunctionalInterface.fun();
        BiConsumer <Integer , String >biConsumer =  new BiConsumer<Integer , String >(){
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer+" "+s);
            }
        };
        biConsumer.accept(1,"Hello");

        // 3 process in which we can provide the method body in the interface
        // lamda expression can be used for only functional intefaces
        Consumer<String> consumer = (X) -> {System.out.println("Hello welcome to the world "+ X);  };
        consumer.accept("Hello");

        BiConsumer <String, Integer> biConsumer1 = (X,Y) ->{
            System.out.println(X+" "+Y);
        };
        biConsumer1.accept("Hello",1);
    }
}
