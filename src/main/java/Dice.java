import java.util.Random;

public class Dice {
    private Random randomDie;
    private int numberOfDice;

    public Dice() {
        this(1);
    }

    public Dice(int numberOfDice) {
        this.randomDie = new Random();
        this.numberOfDice = numberOfDice;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public int tossAndSum() {
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += tossDieAndGetResult();
        }
        return sum;
    }

    private int tossDieAndGetResult() {
        return randomDie.nextInt(6) + 1;
    }
}