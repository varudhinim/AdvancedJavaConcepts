package AcessModifiers.package2;

import AcessModifiers.package1.Student;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNum = 123;
        // client is not a child class so we can not access protected attribute
        //
    }
}
