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

    @Test
    public void testAnyLengthNumbers(){
        assertEquals(18, Calculator.add("1,2,3,5,7"));
    }

    @Test
    public void testDiffDelimiter(){
        assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void testDiffdDelimiter(){
        assertEquals(1, Calculator.add("1,\n"));
    }

    @Test
    public void testDiffDiffDelimiters(){
        assertEquals(14, Calculator.add("//;\n12;2"));
    }

    @Test
    public void testNegativeNumber(){
        try {
            Calculator.add("-1,2");
        }
        catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives not allowed: -1");
        }

        try {
            Calculator.add("2,-4,3,-5");
        }
        catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
        }
    }

    @Test
    public void testOverThousand(){
        assertEquals(2, Calculator.add("1000,2"));
    }


}
