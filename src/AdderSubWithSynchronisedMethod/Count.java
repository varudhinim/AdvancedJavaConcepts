package AdderSubWithSynchronisedMethod;

public class Count {
    private int value;

    Count(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public synchronized void incrementCount(int count){
        this.value += count;
    }

}
