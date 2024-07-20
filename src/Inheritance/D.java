package Inheritance;

public class D extends C{
    D(){
        // we are explicity telling the D class to call C constructor with one param need to be called
        // if we dn't mention like this and if we dn't have any default constructor then we will get compilation error
        //
        super(10);
        System.out.println("D's constructor is called");
    }
    // if we want to access any method from the parent we can access by using super.methode name
    void dcallmeth(){
        super.callSuper();
    }
}
