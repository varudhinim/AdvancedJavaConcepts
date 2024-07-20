package AcessModifiers.package2;

import AcessModifiers.package1.Student;

public class StudentChild extends Student {
    public void doSomething2(){
        // protected attribute from the Student class we can access here due to child parent relation
        UnvirName = "GreatLearning";
        rollNum = 467;
    }
}
