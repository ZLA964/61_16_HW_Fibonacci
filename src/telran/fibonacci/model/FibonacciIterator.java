package telran.fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer>     {
    private int lastFibonacci;
    private int current = 0 ;
    private int previous = 1;

    @Override
    public Integer next() {
        int nextValue = previous + current;
        previous = current;
        current = nextValue ;
        return current;
    }

    public FibonacciIterator(int lastFibonacci) {
        this.lastFibonacci = lastFibonacci;
    }

    @Override
    public boolean hasNext() {
        return current < lastFibonacci;
    }

}
