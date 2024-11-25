package telran.fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int full;
    private int start = 1;
    int i;
    private int current;
    private int previous;

    public FibonacciIterator(int quantity) {
        this.full = quantity;
        this.previous = start;
        int i = 0;
    }

    @Override
    public boolean hasNext() {
        return i < full;
    }

    @Override
    public Integer next() {
        switch (i) {
            case 0:
                current = start;
                i++;
                break;
            case 1:
                i++;
                break;
            default:
                int summ = previous + current;
                previous = current;
                current = summ;
                i++;
        }
//
//        if (i == 0) {
//            previous = start;
//            i++;
//            return start;
//        }
//        if (i == 1) {
//            i++;
//            current = previous;
//        } else {
//            i++;
//            int summ = previous + current;
//            previous = current;
//            current = summ;
//        }
        return current;
    }
}
