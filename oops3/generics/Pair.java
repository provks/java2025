package Java.oops3.generics;

public class Pair<T> {
    private T first;
    private T second;

    // Constructor
    Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Getter and setter
    public T getFirst() {
        return first;
    }
    
    public void setFirst(T first) {
        this.first = first;
    }
    
    public T getSecond() {
        return second;
    }
    
    public void setSecond(T second) {
        this.second = second;
    }
}
