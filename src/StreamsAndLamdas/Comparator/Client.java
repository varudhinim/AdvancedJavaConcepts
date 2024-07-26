package StreamsAndLamdas.Comparator;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(37, "Varudhini", 90),
                new Student(34, "Ganesh", 98),
                new Student(7, "Nakshatra", 100),
                new Student(3, "Lakshika", 0),
                new Student(4, "Varu", 97),
                new Student(5, "TInku", 99)
        );
       // Collections.sort(students);
        // Comparator will give the dec or incr based on the logic we provided
        Comparator<Student> PSPOfStudent = (st1, st2)-> st2.psp-st1.psp;
        Collections.sort(students, PSPOfStudent);
        System.out.println(students);



    }
}
