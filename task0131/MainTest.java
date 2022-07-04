import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test1() {
        assertEquals(2,Main.getMetreFromCentimetre(270));
    }
}