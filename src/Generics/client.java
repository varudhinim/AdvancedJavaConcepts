package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class client {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<Integer>();
//        Pair pair = new Pair();
//        pair.first = 2090;
//        pair.second = "Hello World";
//
//        double x = (double)pair.first;
//        double y = (double)pair.second;// no compile time error but run time error will come

        Pair<String ,Integer> pair = new Pair<>();
        pair.first = "Hello";
        pair.second = 123;
        Pair<String, String> pair2 = new Pair<>();
        pair2.first = "Hello";
        pair2.second = "World";
        // System.out.println(pair2.first+pair2.second);
        //System.out.println(pair.getFirst());
        Pair<String, String> pair3 = new Pair<>();
        pair3.setFirst("Hello");
        pair3.setSecond("World");
        System.out.println(pair3.getFirst());
        System.out.println(pair3.getSecond());

        //these are raw type
        HashMap hm = new HashMap(); // no compile time safety
        hm.put("Scalar", "1");
        hm.put("Varudhini", 10);
        hm.put("Ganesh", "2");
        hm.put(33.567, 456.45);

        // after java5 -> generics are launched
        HashMap<String, Integer> hm2 = new HashMap<>();// compile time safety
        hm2.put("Varudhini", 1);
        hm2.put("Ganesh", 10);
        hm2.put("Array", 2);


        // Backward compatability -> type erased
        Pair.doSomthing1("Scaalr");
        pair.doSomthing(pair.second);
        pair3.doSomthing(pair3.first);
        // static methods

        pair.doSomthing2("Hello", 100);
        pair.doSomthing2(1000, 200);
        pair.doSomthing2(1000L, 300L);

    }

}
