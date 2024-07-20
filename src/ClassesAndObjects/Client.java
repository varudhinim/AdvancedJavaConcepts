package ClassesAndObjects;

public class Client {
    public static void main(String[] args){
        Student st1 = new Student();
        //new Student()=> creates an object of Student class and return the reference
        // object contains copy of all the attributes present inside the class.
        st1.batch_id= 2023;
        st1.name = "Varudhini";
        st1.roolNum = 123;
        st1.address="Hyderabad";
        st1.psp = 95.2;

        Student st2 = new Student();
        st2.batch_id = 2023;
        st2.name = "Ganesh";
        st2.roolNum = 125;
        st2.address = "Bangloor";
        st2.psp = 99;

        st1.name="Nakshatra";
        System.out.println("I am st1 object "+st1);
        System.out.println(" I am st2 object "+st2);
        // when we try to create object for the same class for multiple times
        // each time we will get new address
    }
}
