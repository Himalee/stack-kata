public class Stack {

    public int value = 0;

    public boolean isEmpty() {
        return value == 0;
    }

    public int size() {
        return value;
    }

    public void push() {
        ++value;
    }

    public void pop() {
        --value;
    }
}
