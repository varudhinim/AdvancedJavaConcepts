package Collection;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        List<Integer>numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        System.out.println(numbers.size());
//        for(Integer i : numbers){
//            System.out.print(i+" ");
//        }
    //this initialization will not preserve the order given
        // Set<String> set = new hashSet<>();
    // this will solve the issue of preserving the order
//        Set<String> set = new LinkedHashSet<>();
//        set.add("India");
//        set.add("USA");
//        set.add("China");
//        set.add("Pakistan");
//        set.add("Afghanistan");
//        set.add("Canada");
//        set.add("UAE");
//        set.add("Bangladesh");
//        set.add("England");
//        for(String setInt: set){
//            System.out.println(setInt);
//        }

        Car car = new Car("A", 10000, 7098);
        Car car1 = new Car("B", 100000, 20576);
        Car car2 = new Car("C", 100090, 200);
        Car car3 = new Car("D", 1007897, 576);
        Car car4 = new Car("E", 109809, 122);
        Car car5 = new Car("F", 546798, 78);
        Car car6 = new Car("G", 565887679, 7687709);
        Queue<Car> queue = new PriorityQueue<>();

        queue.add(car);
        queue.add(car1);
        queue.add(car2);
        queue.add(car3);
        queue.add(car4);
        queue.add(car5);
        queue.add(car6);
        while(!queue.isEmpty()){
            System.out.println(queue.peek().ToString());
            queue.poll();
        }



    }
}
