import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void constructorTest1() {
        // Given
        Integer expectedLowestValue = 2;
        Integer expectedHighestValue = 12;
        Integer expectedResult = null;
        Integer binNumber = 13;
        boolean testPassed = true;

        // When
        Bins testBins = new Bins(expectedLowestValue, expectedHighestValue);
        Integer actualResult = testBins.getBin(binNumber);
        Integer actualLowestValue = testBins.getLowestValue();
        Integer actualHighestValue = testBins.getHighestValue();

        if (actualResult != null) {
            testPassed = false;
        }

        if (!actualLowestValue.equals(expectedLowestValue)) {
            testPassed = false;
        }

        if (!actualHighestValue.equals(expectedHighestValue)) {
            testPassed = false;
        }

        // Then
        Assert.assertTrue(testPassed);
    }

    @Test
    public void constructorTest2() {
        // Given
        Integer expectedLowestValue = 2;
        Integer expectedHighestValue = 12;
        Integer expectedResult = 0;
        Integer binNumber = 11;
        boolean testPassed = true;

        // When
        Bins testBins = new Bins(expectedLowestValue, expectedHighestValue);
        Integer actualResult = testBins.getBin(binNumber);
        Integer actualLowestValue = testBins.getLowestValue();
        Integer actualHighestValue = testBins.getHighestValue();

        if (!actualResult.equals(expectedResult)) {
            testPassed = false;
        }

        if (!actualLowestValue.equals(expectedLowestValue)) {
            testPassed = false;
        }

        if (!actualHighestValue.equals(expectedHighestValue)) {
            testPassed = false;
        }

        // Then
        Assert.assertTrue(testPassed);
    }

    @Test
    public void constructorTest3() {
        // Given
        Integer expectedLowestValue = 1;
        Integer expectedHighestValue = 67;
        Integer expectedResult = null;
        Integer binNumber = 78;
        boolean testPassed = true;

        // When
        Bins testBins = new Bins(expectedLowestValue, expectedHighestValue);
        Integer actualResult = testBins.getBin(binNumber);
        Integer actualLowestValue = testBins.getLowestValue();
        Integer actualHighestValue = testBins.getHighestValue();

        if (actualResult != null) {
            testPassed = false;
        }

        if (!actualLowestValue.equals(expectedLowestValue)) {
            testPassed = false;
        }

        if (!actualHighestValue.equals(expectedHighestValue)) {
            testPassed = false;
        }

        // Then
        Assert.assertTrue(testPassed);
    }

    @Test
    public void constructorTest4() {
        // Given
        Integer expectedLowestValue = 7;
        Integer expectedHighestValue = 34;
        Integer expectedResult = 0;
        Integer binNumber = 22;
        boolean testPassed = true;

        // When
        Bins testBins = new Bins(expectedLowestValue, expectedHighestValue);
        Integer actualResult = testBins.getBin(binNumber);
        Integer actualLowestValue = testBins.getLowestValue();
        Integer actualHighestValue = testBins.getHighestValue();

        if (!actualResult.equals(expectedResult)) {
            testPassed = false;
        }

        if (!actualLowestValue.equals(expectedLowestValue)) {
            testPassed = false;
        }

        if (!actualHighestValue.equals(expectedHighestValue)) {
            testPassed = false;
        }

        // Then
        Assert.assertTrue(testPassed);
    }

    @Test
    public void incrementBinTest1() {
        // Given
        Integer lowestValue = 2;
        Integer highestValue = 12;
        Integer binNumber = 6;
        Integer expectedResult = 1;
        Bins testBins = new Bins(lowestValue, highestValue);


        // When
        testBins.incrementBin(binNumber);
        Integer actualResult = testBins.getBin(binNumber);

        // Then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void incrementBinTest2() {
        // Given
        Integer lowestValue = 2;
        Integer highestValue = 12;
        Integer binNumber = 6;
        Integer expectedResult = 8;
        Bins testBins = new Bins(lowestValue, highestValue);

        // When
        for (int i = 0; i < expectedResult; i++) {
            testBins.incrementBin(binNumber);
        }
        Integer actualResult = testBins.getBin(binNumber);

        // Then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void incrementBinTest3() {
        // Given
        Integer lowestValue = 4;
        Integer highestValue = 17;
        Integer binNumber = 8;
        Integer expectedResult = 1;
        Bins testBins = new Bins(lowestValue, highestValue);


        // When
        testBins.incrementBin(binNumber);
        Integer actualResult = testBins.getBin(binNumber);

        // Then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void incrementBinTest4() {
        // Given
        Integer lowestValue = 8;
        Integer highestValue = 32;
        Integer binNumber = 18;
        Integer expectedResult = 62;
        Bins testBins = new Bins(lowestValue, highestValue);

        // When
        for (int i = 0; i < expectedResult; i++) {
            testBins.incrementBin(binNumber);
        }
        Integer actualResult = testBins.getBin(binNumber);

        // Then
        Assert.assertEquals(expectedResult, actualResult);
    }
}
