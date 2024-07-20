package Abstraction;

public class Client {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 22.4 ) ;
        Shape s2 = new Rectangle( 22.4 , 31.0, "Yellow") ;
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
