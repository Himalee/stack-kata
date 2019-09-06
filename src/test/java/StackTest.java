import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack(3);
    }

    @Test
    public void newStackisEmpty() {
        assertEquals(0, stack.size());
   }

   @Test
   public void pushIncreasesSize() {
      stack.push(1);
      assertEquals(1, stack.size());
   }

    @Test
    public void pushAndPopLeavesStackEmpty() {
        stack.push(1);
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    public void popReturnsLastPushedValue() {
        stack.push(3);
        assertEquals(3, stack.pop());
    }

    @Test
    public void pushAndPopMultipleTimes() {
        stack.push(1);
        stack.push(2);
        stack.pop();
        assertEquals(1, stack.pop());
    }

    @Test
    public void stackOverflow() {
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
    }
}
