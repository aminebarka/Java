package Exercice_5;

public class MinMax<T extends Comparable<T>> {
    private T premier;
    private T second;
    public MinMax(T premier, T second) {
        this.premier = premier;
        this.second = second;
    }

    public T getMin() {
        return (premier.compareTo(second)<0)?premier:second ;
    }
    public T getMax() {
        return (second.compareTo(premier)<0)?second:premier ;
    }


}
