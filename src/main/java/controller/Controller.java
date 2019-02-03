package controller;

import strategy.AlgorithmRunner;
import java.util.Scanner;
import static controller.Algorithm.getAlgorithmName;

/**
 * This class provides controller program logic
 * and control all behavior.
 *
 * @version 1.0
 * @author Roman Berezhnov
 * @author Oleh Volchkov
 */
public class Controller {

    /**
     * This is a constant value of exit input code.
     */
    protected static final int EXIT_CODE = 0;

    /**
     * This is a constant value of algorithms.
     */
    private static final int ALGORITHM_LIST_LENGTH = 19;

    /**
     * This is a final value of input provider.
     */
    private final Scanner scan = new Scanner(System.in);

    /**
     * This is a final instance of strategy runner.
     */
    private final AlgorithmRunner runner = new AlgorithmRunner();

    /**
     * This is a final instance of all algorithms.
     */
    private final InstanceManager instanceManager = new InstanceController();

    /**
     * This variable holds user or constant input value.
     */
    private int input;

    /**
     * This method starts a program and hold it lifecycle.
     */
    public void start() {

        boolean playing = true;
        Menu menu = new Menu();
        menu.printWelcome();

        while (playing) {

            menu.printMenu();
            playing = isContinue();
        }
    }

    /**
     * This method resolve user wish to continue
     * or to leave the program.
     *
     * @return result of user wish to continue.
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
     * This method runs a strategy.
     *
     * @param input number of strategy.
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
