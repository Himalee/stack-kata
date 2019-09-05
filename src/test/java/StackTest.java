import org.junit.Assert;
import org.junit.Test;

public class StackTest {
   @Test
    public void emptyStack_isEmptyTrue_sizeZero() {
       Stack stack = new Stack();
       Assert.assertTrue(stack.isEmpty());
       Assert.assertEquals(0, stack.size());
   }
}
