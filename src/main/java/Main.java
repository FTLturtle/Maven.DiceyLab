public class Main {
    public static void main(String[] args) {
        Simulation diceTossSim = new Simulation(2, 1000000);
        diceTossSim.runSimulation();
        diceTossSim.printResults();
    }
}
