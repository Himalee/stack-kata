public class Stack {

    public int counter = 0;

    public boolean isEmpty() {
        return counter == 0;
    }

    public int size() {
        return counter;
    }

    public void push() {
        ++counter;
    }

    public void pop() {
        --counter;
    }
}
