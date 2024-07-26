package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[ " +
                "age = " + age +
                ", name = '" + name + '\'' +
                ']';
    }

    @Override
    public int compareTo(Student st) {
        if(this.age > st.age) return -1;
        else if(this.age < st.age) return 1;
        return 0;
    }
}

public class Client1 {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(32,"Varudhini"));
        student.add(new Student(37,"Ganesh"));
        student.add(new Student(10,"Nakshatra"));
        student.add(new Student(2,"Lakshika"));


        for(Student studen: student){
            System.out.println(studen);
        }

        Collections.sort(student);

        System.out.println("After applying the sort function "+student);

    }
}
