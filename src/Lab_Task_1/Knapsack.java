package Lab_Task_1;

public class Knapsack {
    public static void main(String arg[])
    {
        int val[] = { 45,15,20,10,30 };
        int wt[] = { 2,1,3,1,2 };
        int W = 7;
        int n = val.length;

        printknapSack(W, wt, val, n);
    }

    static void printknapSack(int W, int wt[], int val[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = Math.max(val[i - 1] +
                            K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        int res = K[n][W];
        System.out.println(res);

        w = W;
        for (i = n; i > 0 && res > 0; i--) {

            if (res == K[i - 1][w]) {
                // Nothing
            }
            else {

                System.out.print(wt[i - 1] + "\t");
                res = res - val[i - 1];
                w = w - wt[i - 1];
            }
        }
    }
}


