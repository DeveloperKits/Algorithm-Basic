package Greedy_Algorithm;

import java.util.*;

public class Coin_Change {
    public static int coinChangeGreedy(int[] coins, int n) {

        int result = 0;
        int carry;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (n != 0) {

            for (int i = coins.length - 1 ; i>=0 ; i--) {
                if (coins[i] <= n) {
                    n = n - coins[i];
                    System.out.println("Adding " + coins[i] + " tk note");
                    i++;

                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] coins = {10, 20, 50, 100, 200};
        int n = 50;

        int result = coinChangeGreedy(coins, n);

        System.out.println("You will give him " + result + " note");
    }
}

