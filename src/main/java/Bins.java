import java.util.HashMap;

public class Bins {
    private HashMap<Integer, Integer> binsTreeMap;
    private int lowestValue;
    private int highestValue;

    public Bins(int lowestValue, int highestValue) {
        this.lowestValue = lowestValue;
        this.highestValue = highestValue;
        this.binsTreeMap = new HashMap<>(highestValue - lowestValue + 1);
        for (int i = lowestValue; i <= highestValue; i++) {
            binsTreeMap.put(i, 0);
        }
    }

    public Integer getBin(Integer binNumber) {
        return binsTreeMap.get(binNumber);
    }

    public void incrementBin(Integer binNumber) {
        Integer currentValue = binsTreeMap.get(binNumber);
        if (currentValue != null) {
            binsTreeMap.put(binNumber, currentValue + 1);
        }
    }

    public int getLowestValue() {
        return lowestValue;
    }

    public int getHighestValue() {
        return highestValue;
    }
}