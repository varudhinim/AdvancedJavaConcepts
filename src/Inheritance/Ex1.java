package Inheritance;

public class Ex1 {
    // these are the examples of the compile time polymorphism
    // if we change order of the params to be passed to the method also matters
    void doSoming(){
        System.out.println("Inside doSoming");
    }
    void doSoming(int z){
        System.out.println("Inside doSoming"+ z);
    }
    void doSoming(String z){
        System.out.println("Inside doSoming"+ z);
    }
    void doSoming(int x, String Z){
        System.out.println("Inside doSoming"+ x);
    }
    void doSoming(String ZZ, int x){
        System.out.println("Inside doSoming"+ ZZ);
    }
}
