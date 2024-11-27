package telran.fibonacci.model;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{
    private int quantity;
    private int lastFibonacci;


    public Fibonacci() {
    }

    public Fibonacci(int quantity) {
        this.quantity = quantity;
        this.lastFibonacci = 0 ;
        int previous = 1;
        while(quantity>0){
                int nextValue = previous + lastFibonacci;
                previous = lastFibonacci;
                lastFibonacci = nextValue ;
                quantity--;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(lastFibonacci);
    }

    public int getLastFibonacci() {
        return lastFibonacci;
    }
}
