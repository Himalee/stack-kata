import java.util.Arrays;

public class Stack {

    private int counter;
    private int[] values;

    public Stack(int size) {
        values = new int[size];
    }

    public int size() {
        return counter;
    }

    public void push(int value) {
        if (counter == values.length)
            values = Arrays.copyOf(values, values.length*2);

        values[counter++] = value;
    }

    public int pop() {
        return values[--counter];
    }
}