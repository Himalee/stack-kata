public class Stack {

    public int [] values = new int[2];
    public int counter = 0;

    public boolean isEmpty() {
        return counter == 0;
    }

    public int size() {
        return counter;
    }

    public void push() {
        values[counter] = ++counter;
    }

    public int pop() {
        return values[counter--];
    }
}