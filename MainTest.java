import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    void main_printsExpectedOutput() {
        // Capture System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        try {
            Main.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }

        String output = baos.toString().replace("\r\n", "\n").replace("\r", "\n");
        assertTrue(output.contains("Addition Result: 15"),
            "Expected output to contain 'Addition Result: 15' but was: " + output);
    }
}
