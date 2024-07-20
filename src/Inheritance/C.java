package Inheritance;

public class C extends B{
    C(){
        System.out.println("C's Constructor is called");
    }
    C(int a){
        System.out.println("C's Constructor is called with one parameter");
    }
    C(int a, String b){
        System.out.println("C's Constructor is called with two parameter");
    }

    public void callSuper(){
        System.out.println("C's callSuper is called");
    }
}
