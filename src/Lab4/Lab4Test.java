package Lab4;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Lab4Test {
    
    public Lab4Test() {
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
    public void swapIntegers() {
        Lab4<Integer> integerSwapInList = new Lab4<>();

        List<Integer> inputIntegerList = Arrays.asList(1, 2, 3);
        List<Integer> expectedIntegerList = Arrays.asList(2, 1, 3);
        
        System.out.println("swapIntegers 1 2 3");
        assertEquals(expectedIntegerList, integerSwapInList.swap(0, 1, inputIntegerList));
    }

    @Test
    public void swapStrings() {
        Lab4<String> stringSwapInList = new Lab4<>();

        List<String> inputStringList = Arrays.asList("x", "y", "z");
        List<String> expectedStringList = Arrays.asList("x", "z", "y");

        System.out.println("swapStrings x y z");
        assertEquals(expectedStringList, stringSwapInList.swap(1, 2, inputStringList));
    }

    @Test
    public void swapDoubles() {
        Lab4<Double> doubleSwapInList = new Lab4<>();

        List<Double> inputDoubleList = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> expectedDoubleList = Arrays.asList(2.0, 1.0, 3.0);

        System.out.println("swapDoubles 1.0 2.0 3.0");
        assertEquals(expectedDoubleList, doubleSwapInList.swap(0, 1, inputDoubleList));
    }

}