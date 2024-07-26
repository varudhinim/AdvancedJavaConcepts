package Assignment;


import java.util.*;

class Demo{
    int age;
    String name;

    public Demo(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [" +
                "age = " + age +
                ", name = " + name +
                ']' ;
    }
}

public class Client {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Varudhinikjhkjnkljl","Lakishikajlkj","Nakshatra","Ganesh");
        Collections.sort(names);
        System.out.println(names);
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2){
                if(s1.length()>s2.length()){
                    return 1;
                }else return -1;
            }
        };

        Collections.sort(names, comparator);

        System.out.println("After using the comparator "+names);



        // this for comparables


        List<Demo> student = new ArrayList<>();
        student.add(new Demo(32,"Varudhini"));
        student.add(new Demo(37,"Ganesh"));
        student.add(new Demo(10,"Nakshatra"));
        student.add(new Demo(2,"Lakshika"));
        for(Demo studen: student){
            System.out.println(studen);

        }
        Comparator<Demo> comparator1 = new Comparator<Demo>() {
            public int compare(Demo s1, Demo s2){
                if(s1.age>s2.age){
                    return 1;
                }else return -1;
            }
        };
    Collections.sort(student,comparator1);
    System.out.println("After using the comparator "+student);

    }
}
