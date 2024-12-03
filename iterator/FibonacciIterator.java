package iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer> {
    private int previous = 0;
    private int current = 1;

    @Override
    public boolean hasNext() {
        return true; // Fibonacci sequence is theoretically infinite
    }

    @Override
    public Integer next() {
        int nextValue = previous + current;
        previous = current;
        current = nextValue;
        return previous;
    }
}