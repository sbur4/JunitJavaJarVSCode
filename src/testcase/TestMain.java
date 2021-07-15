package testcase;

import logic.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestMain {

    @BeforeClass
    // annotation specifies that method will be invoked only once,
    // before starting all the tests.
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }

    @Before
    // annotation specifies that method will be invoked before each test.
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    // annotation specifies that method is the test method.
    // @Test(timeout=1000) annotation specifies that method will be failed if it
    // takes longer than 1000 milliseconds (1 second).
    public void testFindMax() {
        System.out.println("test find max");
        assertEquals(4, Main.findMax(new int[] { 1, 3, 4, 2 }));
        assertEquals(-1, Main.findMax(new int[] { -12, -1, -3, -4, -2 }));
    }

    @Test
    public void testFindMin() {
        System.out.println("test find min");
        assertEquals(4, Main.findMin(new int[] { 1, 3, 4, 2 }));
        assertEquals(-1, Main.findMin(new int[] { -12, -1, -3, -4, -2 }));
    }

    @After
    // annotation specifies that method will be invoked after each test.
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @AfterClass
    // annotation specifies that method will be invoked only once, after
    // finishing all the tests.
    public static void tearDownAfterClass() throws Exception {
        System.out.println("after class");
    }
}
