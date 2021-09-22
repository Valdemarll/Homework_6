package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceTest {
    Sequence sequence = new Sequence(new Object[] {1, 2});
    Sequence.Selector selector = sequence.new Selector();
    @Test
    public void selectorTest() {
        assertTrue(selector.end());
        assertEquals(1, selector.current());
        selector.next();
        assertEquals(2, selector.current());
        selector.next();
        assertFalse(selector.end());

    }

}