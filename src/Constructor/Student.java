package Constructor;

import static java.lang.System.out;

public class Student {
    // if we define any values while declaring the attributes at the class
    // and the default constructor is not defined in the class level
    // while creating the object of this class the values will be passed to the object.

    int rollNum = 23;
    String name;
    double psp;
    String UnvirName;


        // without constructor we can't create objects
    // defaultConstructor


    // even below constructor is not defined then automatically java will create default constructor
    Student(){
        // these are default values  means if any value is not given after object
        // intialization these values will be set
        name= "Varudhini";
        psp=95.23;
        UnvirName="Scalar";
    }
    Student(int rollNum, String name){
        this.rollNum = rollNum;
        this.name = name;
    }
    Student(int rollNum, String name, double psp){
        this.rollNum = rollNum;
        this.name = name;
        this.psp = psp;
    }
    Student(int rollNum, String name, double psp, String UnvirName){
        this.rollNum = rollNum;
        this.name = name;
        this.psp = psp;
        this.UnvirName = UnvirName;
    }
    //copy constructor
    Student (Student st){
        this.rollNum = st.rollNum;
        this.name = st.name;
        this.psp = st.psp;
        // this.UnvirName = st.UnvirName;
    }
    void fillCoffe(Student st){
        st = new Student();
        System.out.println("Filling Coffe");
    }

}
