package Algorithms;

public class PaintingTheFence {

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

}
