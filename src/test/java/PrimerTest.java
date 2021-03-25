import com.morris.repeat.primer.Primer;
import org.junit.Assert;
import org.junit.Test;

public class PrimerTest {

    @Test
    public void testIsMultiple() {
        boolean multiple1 = Primer.isMultiple(2, 13);
        boolean multiple2 = Primer.isMultiple(2, 14);
        Assert.assertFalse(multiple1);
        Assert.assertTrue(multiple2);
    }

    @Test
    public void testIsEven() {
        boolean n1 = Primer.isEven(16);
        boolean n2 = Primer.isEven(15);
        Assert.assertTrue(n1);
        Assert.assertFalse(n2);
    }

    @Test
    public void testSumOfAllEvenPositive() {
        int sum = Primer.sumOfAllEvenPositives(20);
        System.out.println("Total: " + sum);
        Assert.assertEquals(sum, 50 );
    }

    @Test
    public void testSumOfAllPositive() {
        int sum = Primer.sumOfAllPositives(32);
        System.out.println("Total: " + sum);
        Assert.assertEquals(sum, 272);
    }

    @Test
    public void testSumOfAllPositiveSquares() {
        int sum = Primer.sumOfAllPositiveSquares(18);
        System.out.println("Total: " + sum);
        Assert.assertEquals(sum, 1140);
    }

    @Test
    public void testCountVowels() {
        String str = "This is a string with 7 vowels";
        int vowels = Primer.countVowels(str);
        Assert.assertEquals(vowels, 7);

    }

    @Test
    public void testRemovePunctuations() {
        String str = "Let's try, Mike!";
        String strValue = Primer.removePunctuations(str);
        Assert.assertEquals(strValue, "Lets try Mike");
    }

    @Test
    public void testIsPossibleArithmetic() {
        boolean isPossible1 = Primer.isPossibleArithmetic(1, 2, 4);
        boolean isPossible2 = Primer.isPossibleArithmetic(1, 2, 3);
        Assert.assertFalse(isPossible1);
        Assert.assertTrue(isPossible2);
    }

    @Test
    // You can print values to review matching distinct Pairs
    public void testIsEvenProductOfDistinctPairs() {
        int[] array1 = {3, 7, 11, 22, 18};
        int[] array2 = {3, 1};
        int[] array3 = {2345};
        boolean value1 = Primer.isEvenProductOfDistinctPairs(array1);
        boolean value2 = Primer.isEvenProductOfDistinctPairs(array2);
        boolean value3 = Primer.isEvenProductOfDistinctPairs(array3);
        Assert.assertTrue(value1);
        Assert.assertFalse(value2);
        Assert.assertFalse(value3);
    }

    @Test
    public void testRepeatedlyDivideByTwo() {
        int n1 = Primer.repeatedlyDivideByTwo(0);
        int n2 = Primer.repeatedlyDivideByTwo(6);
        int n3 = Primer.repeatedlyDivideByTwo(100);
        Assert.assertEquals(0, n1);
        Assert.assertEquals(1, n2);
        Assert.assertEquals(5, n3);
    }

    @Test
    public void testFloatArrayIsDistinct() {
        float[] array1 = {1.2f, 3.3f, 4.5f, 12.3f};
        float[] array2 = {12.5f, 11.2f, 5.4f, 104.3f, 5.4f};
        boolean value1 = Primer.floatArrayIsDistinct(array1);
        boolean value2 = Primer.floatArrayIsDistinct(array2);
        Assert.assertTrue(value1);
        Assert.assertFalse(value2);
    }
}
