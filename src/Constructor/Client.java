package Constructor;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();

        // these ar the value we are giving manually after creating object
        // if we didn't give default values will be assigned
        st.name= "Laskika";
        st.rollNum = 12;
        st.UnvirName = "FrontLine";
        st.psp = 100;
        st.fillCoffe(st);

        Student st4 = new Student();
        Student st1 = new Student(22,"Ganesh");
        Student st2 = new Student(22,"Lakshika", 99.9);
        Student st3 = new Student(22,"Nakshatra", 99.9, "Sloka");

        // for copy the object we can call the constructor of the class which accepts
        // the object of that class
        // we are calling the copy constructor for creating the copy of the object;
        Student copyStudent = new Student(st3);
        copyStudent.name="XYZ";
        st3.name = "EKLEKL";

        System.out.println("I am after changing the name value in copy constructor "+ st3.name);
        System.out.println("I am after changig in copy constructor "+ copyStudent.name);

    }
}
