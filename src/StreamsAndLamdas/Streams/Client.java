package StreamsAndLamdas.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> numbersStream = numbers.stream();
        Stream<Integer> numbersStream2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1);
        builder.add(2);
        builder.add(3);
        builder.add(4);
        builder.add(5);
        builder.add(6);
        builder.add(7);
        builder.add(8);
        builder.add(9);
        builder.add(10);
        builder.build();


    }
}
