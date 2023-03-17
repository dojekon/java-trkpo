package Lab6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Lab6Test {
    public Lab6Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void sumTwoPlusTwo() {
        Lab6 calc = new Lab6();
        assertEquals(4,calc.sum(2, 2));
    }

    @Test
    public void intOverflow() {
        try {
            Lab6 calc = new Lab6();
            calc.sum(Integer.MAX_VALUE, 1);
        } catch (Exception e) {
            assertEquals("Integer overflow", e.getMessage());
        }
    }

    @Test
    public void intUnderflow() {
        try {
            Lab6 calc = new Lab6();
            calc.sum(-1, Integer.MIN_VALUE);
        } catch (Exception e) {
            assertEquals("Integer underflow", e.getMessage());
        }
    }
    
    
}
