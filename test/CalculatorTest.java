import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    @Test
    void multiplyTwoFactors() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.multiply(3, 5));
    }
    @Test
    void multiplyThreeFactors() {
        Calculator calc = new Calculator();
        assertEquals(150, calc.multiply(3, 5, 10));
    }
}

