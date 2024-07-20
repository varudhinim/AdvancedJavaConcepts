package Abstraction;

public abstract class Shape {
    String color;

    public Shape(String color){
        System.out.println("shape of the constructor called");
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    // Abstract Methods
    abstract double area();
    public abstract String toString();
}
