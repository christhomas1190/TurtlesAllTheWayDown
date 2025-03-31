import static org.junit.jupiter.api.Assertions.*;

import PACKAGE_NAME.Factorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, factorial.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, factorial.factorial(1));
    }

    @Test
    public void testFactorialOfThree() {
        assertEquals(6, factorial.factorial(3));
    }


}