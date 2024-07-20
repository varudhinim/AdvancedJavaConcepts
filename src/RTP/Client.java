package RTP;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        B b = new B();
//        b.doSomthing("Hello World");
//        A a = new A();
//        a.doSomthing("Hello World");
//        A a1 = new B();
//        a1.doSomthing("Hello World");

        List<A> list = new ArrayList<>();
        list.add(new A());
        list.add(new B());
        list.add(new C());
        for(A it: list){
            it.doSomthing("Hello World");
        }
    }
}
