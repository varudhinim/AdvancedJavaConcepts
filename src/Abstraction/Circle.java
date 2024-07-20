package Abstraction;

public class Circle extends Shape{
    double radius;

    public Circle(String Color, double radius) {
        super(Color);
        System.out.println("Inside Circle Constructor called");
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "circle color is " + color + " and area of the  is " + area();
    }
}
