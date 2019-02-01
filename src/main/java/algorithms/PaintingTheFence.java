package algorithms;

import strategy.IAlgorithmStrategy;

import static utilities.util.enterPositiveNumber;

/**
 * Class that realized logic of the ways for painting the fence
 *
 * @version 1.0
 * @author Valentyn Yarmoshyk
 */
public class PaintingTheFence implements IAlgorithmStrategy {

    /**
     * Return the number of the ways for painting the fence
     *
     * @param n The number of posts you need to paint
     * @param k The number of colors you have
     * @return The number of the ways for painting the fence
     */
    public static long paintingTheFence(int n, int k){

        long[] variant = new long[n];

        variant[0] = k;
        long different = k;
        long same = 0;

        for(int i = 1; i < n; i++){

            same = different;
            different = variant[i-1]*(k-1);
            variant[i] = same + different;

        }

        return variant[n-1];
    }

    public void execute() {

        System.out.println("Enter the count of posts:");
        int posts = enterPositiveNumber();

        System.out.println("Enter the count of colors:");
        int colors = enterPositiveNumber();

        System.out.println("The different ways for painting the fence: " + PaintingTheFence.paintingTheFence(posts, colors));

    }
}
