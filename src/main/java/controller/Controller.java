package controller;

import strategy.AlgorithmRunner;

import java.util.Scanner;

import static controller.Algorithm.getAlgorithmName;

/**
 * Handles user interaction with a program.
 *
 * @author Roman Berezhnov
 * @author Oleh Volchkov
 */
public class Controller {

    /**
     * Constant value of exit input code.
     */
    static final int EXIT_CODE = 0;

    /**
     * Constant value of algorithms.
     */
    private static final int ALGORITHM_LIST_LENGTH = 19;

    /**
     * Final value of input provider.
     */
    private final Scanner scan = new Scanner(System.in);

    /**
     * Final instance of strategy runner.
     */
    private final AlgorithmRunner runner = new AlgorithmRunner();

    /**
     * Final instance of all algorithms.
     */
    private final InstanceManager instanceManager = new InstanceCreator();

    /**
     * User or constant input value.
     */
    private int input;

    /**
     * Starts a program and holds it lifecycle.
     */
    public void start() {

        //todo: change name
        boolean playing = true;
        Menu menu = new Menu();
        menu.printWelcome();

        while (playing) {

            menu.printMenu();
            playing = isContinue();
        }
    }

    /**
     * Resolves user wish to continue or to leave the program.
     *
     * @return result of user wish.
     */
    private boolean isContinue() {

        input = getInput();

        if (input == EXIT_CODE) {
            return false;
        }

        getStrategy(input);
        return true;
    }

    /**
     * Runs a strategy.
     *
     * @param input index of strategy.
     */
    private void getStrategy(int input) {

        Algorithm name = getAlgorithmName(input);
        runner.changeStrategy(instanceManager.getAlgorithm(name));
        runner.run();
    }

    /**
     * This method controls the conformity of input.
     *
     * @return correct menu item.
     */
    // todo: replace with UserInputValidator
    private int getInput() {

        try {
            if (scan.hasNextLine()) {
                input = Integer.parseInt(scan.nextLine());
                if (input < EXIT_CODE || input > ALGORITHM_LIST_LENGTH) {
                    throw new NumberFormatException();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\n" + "Wrong input, try again please!");
            System.out.print("Type here please: ");
            getInput();
        }

        return input;
    }
}