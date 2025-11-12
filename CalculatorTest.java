import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void add_returnsSum_forPositiveNumbers() {
        assertEquals(15, Calculator.add(10, 5));
        assertEquals(0, Calculator.add(2, -2));
        assertEquals(-7, Calculator.add(-2, -5));
    }
}
