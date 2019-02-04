package algorithms;

import strategy.IAlgorithmStrategy;

import static utilities.UserInputValidator.getUserInput;

/**
 * Class that realized logic of the ways for painting the fence.
 *
 * @author Valentyn Yarmoshyk
 * @version 1.0
 */
public class PaintingTheFence implements IAlgorithmStrategy {

    /**
     * Return the number of the ways for painting the fence.
     *
     * @param n The number of posts you need to paint
     * @param k The number of colors you have
     * @return The number of the ways for painting the fence
     */
    public static long paintingTheFence(int n, int k) {

        long[] variant = new long[n];

        variant[0] = k;
        long different = k;
        long same = 0;

        for (int i = 1; i < n; i++) {

            same = different;
            different = variant[i - 1] * (k - 1);
            variant[i] = same + different;

        }

        return variant[n - 1];
    }

    @Override
    public void execute() {
        String incorrectInputMessage = "Incorrect input. Please, provide integer value that bigger than 0";
        System.out.println("Enter the count of posts:");
        int posts = getUserInput(0, Integer.MAX_VALUE, incorrectInputMessage);

        System.out.println("Enter the count of colors:");
        int colors = getUserInput(0, Integer.MAX_VALUE, incorrectInputMessage);

        System.out.println("The different ways for painting the fence: "
                + PaintingTheFence.paintingTheFence(posts, colors));

    }
}
