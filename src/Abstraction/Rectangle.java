package Abstraction;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
        System.out.println("Inside Rectangle constructor is called");
    }
    double area(){
        return length*width;
    }

    @Override
    public String toString() {
        System.out.println("I am from the parent  Abstarct class calling this method "+ super.getColor());
        return "Rectangle color is "+ getColor()+" and area is "+area();
    }
}
