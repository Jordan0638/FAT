import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testArithmetic() {
        assertEquals(5, App.add(2, 3));
        assertEquals(3, App.sub(5, 2));
        assertEquals(12, App.mul(3, 4));
    }
}