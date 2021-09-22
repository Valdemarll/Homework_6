package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class IteratorTest {

    @Test
    public void go() {
        Iterator iterator = new Iterator(new Object[] {1, 2, 3, 4});
        assertEquals("1\n2\n3\n4\n", iterator.go());
    }
}