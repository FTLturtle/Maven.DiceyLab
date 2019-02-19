import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void emptyConstructorTest() {
        // Given
        int expectedNumberOfDice = 1;

        // When
        Dice testDice = new Dice();
        int actualNumberOfDice = testDice.getNumberOfDice();

        // Then
        Assert.assertEquals(expectedNumberOfDice, actualNumberOfDice);
    }

    @Test
    public void intConstructorTest1() {
        // Given
        int expectedNumberOfDice = 10;

        // When
        Dice testDice = new Dice(expectedNumberOfDice);
        int actualNumberOfDice = testDice.getNumberOfDice();

        // Then
        Assert.assertEquals(expectedNumberOfDice, actualNumberOfDice);
    }

    @Test
    public void intConstructorTest2() {
        // Given
        int expectedNumberOfDice = 2;

        // When
        Dice testDice = new Dice(expectedNumberOfDice);
        int actualNumberOfDice = testDice.getNumberOfDice();

        // Then
        Assert.assertEquals(expectedNumberOfDice, actualNumberOfDice);
    }

    @Test
    public void tossAndSumTest1() {
        // Given
        int minValue = 2;
        int maxValue = 12;
        boolean resultInRange = true;
        Dice testDice = new Dice(minValue);
        int resultOfToss;

        // When
        for (int i = 0; i < 100; i++) {
            resultOfToss = testDice.tossAndSum();
            if (resultOfToss < minValue || maxValue < resultOfToss) {
                resultInRange = false;
            }
        }

        // Then
        Assert.assertTrue(resultInRange);
    }

    @Test
    public void tossAndSumTest2() {
        // Given
        int minValue = 3;
        int maxValue = 18;
        Dice testDice = new Dice(minValue);
        boolean resultInRange = true;
        int resultOfToss;

        // When
        for (int i = 0; i < 100; i++) {
            resultOfToss = testDice.tossAndSum();
            if (resultOfToss < minValue || maxValue < resultOfToss) {
                resultInRange = false;
            }
        }

        // Then
        Assert.assertTrue(resultInRange);
    }
}
