package ClassesAndObjects;

public class Student {
    int roolNum;
    String name;
    int age;
    String unviName;
    int batch_id;
    double psp;
    String address;

    void attended_class(){
        System.out.println("Attended Class");
    }
    void change_batch(int new_batch_id){
        batch_id = new_batch_id;
    }
    void course_pause(){
        System.out.println("your course is paused successfully");
    }
}
