package StreamsAndLamdas.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StremsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,9,7,4,5,68,23,4325,7,68,7);
        // write a code to extract odd number from list

        List<Integer> oddNumber = new ArrayList<>();
        for(Integer i : list){
            if(i%2!=0) oddNumber.add(i);
        }
        System.out.println(oddNumber);

        List<Integer> oddNumberStream = list.stream().filter(i -> i%2!=0).toList();
        System.out.println(oddNumberStream);
    }
}
