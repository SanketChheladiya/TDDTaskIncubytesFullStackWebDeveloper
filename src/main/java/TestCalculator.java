import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestCalculator {

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestCalculator");
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void testOneNumber() {
        assertEquals(1, Calculator.add("1"));
    }

    @Test
    public void testTwoNumbers(){
        assertEquals(3, Calculator.add("1,2"));
    }

}
