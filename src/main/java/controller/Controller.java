package controller;

import strategy.AlgorithmRunner;

import static controller.AlgorithmName.getAlgorithmName;
import static utilities.UserInputValidator.getUserInput;

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
     * Constant value of error message.
     */
    private static final String ERROR_MESSAGE = "Wrong input, try again please!";

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

        boolean running = true;
        Menu menu = new Menu();
        menu.printWelcome();

        while (running) {

            menu.printMenu();
            running = isContinue();
        }
    }

    /**
     * Resolves user wish to continue or to leave the program.
     *
     * @return result of user wish.
     */
    private boolean isContinue() {

        input = getUserInput(EXIT_CODE, ALGORITHM_LIST_LENGTH, ERROR_MESSAGE);

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

        AlgorithmName name = getAlgorithmName(input);
        runner.changeStrategy(instanceManager.getAlgorithm(name));
        runner.run();
    }
}