package main;

import strategy.AlgorithmRunner;

import java.util.Scanner;

public class Starter {

    private final Scanner scanner = new Scanner(System.in);
    private final AlgorithmRunner runner = new AlgorithmRunner();

    public void start() {

        boolean playing = true;
        new Initializer();
        Menu menu = new Menu();
        // menu.hello();

        while (playing) {

            menu.showAlgorithmList();
            playing = get();
        }
    }

    private boolean get() {

        int input = getInput();

        if (input == 0) {
            return false;
        } else if (input < 0 || input > 19) {
            System.err.println("Wrong input, try again please!");
            return true;
        } else {
            getStrategy(input);
        }

        return true;
    }

    private void getStrategy(int input) {

        Algorithm name = Algorithm.getAlgorithmName(input);
        runner.changeStrategy(Initializer.get(name));
        runner.run();
    }

    private int getInput() {

        int input = -1;

        try {
            input = scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
        }

        return input;
    }
}
