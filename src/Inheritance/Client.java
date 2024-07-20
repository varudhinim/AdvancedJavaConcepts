package Inheritance;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.name= "varudhini";
        user.contactNumber = 1254354;
        user.email = "varudhini@gmail.com";

        Instructor instructor = new Instructor();
        instructor.name= "Ganesh";
        instructor.scheduleClass();

        D d = new D();

    }
}
