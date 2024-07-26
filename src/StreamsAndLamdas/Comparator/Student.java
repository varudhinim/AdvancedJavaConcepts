package StreamsAndLamdas.Comparator;

public class Student {
    int rollNumber;
    String name;
    int psp;
    Student(int rollNumber, String name, int psp) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.psp = psp;
    }
    public String toString() {
        return "[ Student rollNumber=" + rollNumber + ", name=" + name + ", psp=" + psp+" ]\n";
    }
}
