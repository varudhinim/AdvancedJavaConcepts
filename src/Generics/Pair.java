package Generics;

public class Pair <A, B> {
    A first;
    B second;

    void setFirst(A first){
        this.first = first;
    }
    void setSecond(B second){
        this.second = second;
    }
    // generic return type
    public A getFirst(){
        return first;
    }
    public B getSecond(){
        return second;
    }
    public void doSomthing(B dataa){
        System.out.println("Pair doSomthing");
    }

    // generally we define the data type at time of object creation but here the method is static so we can't
    //  access the static methods using Object directly. by using class name we can acess
    //    public static void doSomething(A pair){
    //        System.out.println("Pair doSomething");
    //    }

    // to avoid the above problem we define in such way that
    public static <T> void doSomthing1(T dataType){
        System.out.println("Pair doSomthing1");
    }

    public static  <A, B> void doSomthing2(A a, B b){
        System.out.println("Pair doSomthing2");
    }



}
