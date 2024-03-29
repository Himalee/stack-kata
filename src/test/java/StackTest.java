import org.junit.Assert;
import org.junit.Test;

public class StackTest {
   @Test
    public void emptyStack_isEmpty() {
       Stack stack = new Stack();
       Assert.assertTrue(stack.isEmpty());
       Assert.assertEquals(0, stack.size());
   }

    @Test
    public void pushToEmptyStack_stackIsNotEmptyAndHasSizeOfOne() {
        Stack stack = new Stack();
        stack.push();
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(1, stack.size());
    }

    @Test
    public void pushAndPopToEmptyStack_stackIsEmpty() {
        Stack stack = new Stack();
        stack.push();
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
        Assert.assertEquals(0, stack.size());
    }

    @Test
    public void pushTwiceToEmptyStack_stackHasSizeOfTwo() {
        Stack stack = new Stack();
        stack.push();
        stack.push();
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(2, stack.size());
    }

    @Test
    public void pushTwiceToEmptyStack_getLastElementInStack() {
        Stack stack = new Stack();
        stack.push();
        stack.push();
        Assert.assertEquals(2, stack.peek());
    }

    @Test
    public void pushThreeTimesToEmptyStack_getLastElementInStack() {
        Stack stack = new Stack();
        stack.push();
        stack.push();
        stack.push();
        Assert.assertEquals(3, stack.peek());
    }
}
