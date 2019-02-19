public class Simulation {
    Dice dice;
    Bins bins;
    int numberOfDice;
    int numberOfTosses;

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(this.numberOfDice);
        this.bins = new Bins(this.numberOfDice, this.numberOfDice * 6);
    }

    public void runSimulation() {
        int resultOfToss;
        for (int i = 0; i < numberOfTosses; i++){
            resultOfToss = dice.tossAndSum();
            bins.incrementBin(resultOfToss);
        }
    }

    public void printResults() {
        String singleLine;
        int binTotal;
        double frequency;
        String stars;

        for (int binNum = this.bins.getLowestValue(); binNum <= this.bins.getHighestValue(); binNum ++) {
            frequency = this.bins.getBin(binNum) / (double)this.numberOfTosses;
            binTotal = this.bins.getBin(binNum);
            stars = getStars(frequency);
            singleLine = String.format("%2d :%9d: %.2f %s", binNum, binTotal, frequency, stars);
            System.out.println(singleLine);
        }
    }

    private String getStars(double frequency) {
        long numOfStars = Math.round(frequency * 100d);
        StringBuilder stringBuilderOfStars = new StringBuilder();
        for (int i = 0; i < numOfStars; i++) {
            stringBuilderOfStars.append('*');
        }
        return stringBuilderOfStars.toString();
    }

}