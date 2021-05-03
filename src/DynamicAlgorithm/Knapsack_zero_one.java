package DynamicAlgorithm;

import static java.lang.Math.max;

public class Knapsack_zero_one {
    public static void main(String[] args) {
        int[] val = new int[] { 5, 3, 5, 7, 6 };
        int[] wt = new int[] { 10, 4, 3, 6, 2 };
        int W = 15;
        int n = val.length;
        System.out.println("Maximum profit: " + knapSack(W, wt, val, n));

    }

    private static int knapSack(int W, int[] wt, int[] val, int n) {

        int i, w;
        int[][] K = new int[n + 1][W + 1];

        for (i = 0; i<= n; i++) {

            for (w = 0; w<= W; w++) {

                if (i == 0 || w == 0)
                    K[i][w] = 0;

                else if (wt[i - 1] <= w) {
                    K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                    System.out.println("....." + K[i][w]);
                }

                else {
                    K[i][w] = K[i - 1][w];
                    System.out.println("!!!....." + K[i][w]);
                }

            }

        }

        return K[n][W];
    }
}
