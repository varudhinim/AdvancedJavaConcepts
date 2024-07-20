package Static;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();

        // we can access the static variable directly by accessing class name
        Student.domainName ="scaler.com";
        Student.unviName ="Scalar";
        Student.dressCode ="blue";

        System.out.println(Student.domainName);
        System.out.println(student.domainName);
        System.out.println(student1.domainName);

        Student.changeDomainName("gmail.com");
        System.out.println(Student.domainName);
        System.out.println(student.domainName);
        System.out.println(student1.domainName);

    }
}
