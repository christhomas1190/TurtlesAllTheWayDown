import static org.junit.jupiter.api.Assertions.*;

import PACKAGE_NAME.GCD;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GCDTest {
    private GCD gcdCalculator;

    @BeforeEach
    public void setUp() {
        gcdCalculator = new GCD();
    }

    @Test
    public void testGCDOf12And8() {
        assertEquals(4, gcdCalculator.gcd(12, 8));
    }

    @Test
    public void testGCDOf101And103() { // Prime numbers
        assertEquals(1, gcdCalculator.gcd(101, 103));
    }

    @Test
    public void testGCDOf56And98() {
        assertEquals(14, gcdCalculator.gcd(56, 98));
    }

    @Test
    public void testGCDWithZero() {
        assertEquals(10, gcdCalculator.gcd(10, 0));
        assertEquals(10, gcdCalculator.gcd(0, 10));
    }

}