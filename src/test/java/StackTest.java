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
}
