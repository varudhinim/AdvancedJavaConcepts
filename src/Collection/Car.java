package Collection;

public class Car  implements Comparable<Car> {
    private String name;
    private int price;
    private int Speed;

    public Car(String name, int price, int Speed){
        this.name = name;
        this.price = price;
        this.Speed = Speed;
    }

    public String ToString(){
        return "[ Name = " + this.name + " Speed = " + this.Speed+  " Price = " + this.price +  " ]";
    }

    @Override
    public int compareTo(Car o) {
        return o.Speed-this.Speed;
    }
}
