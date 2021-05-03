package DynamicAlgorithm;

public class Coin_Change {
    public static void main(String[] args) {

        int[] Coins = {1, 5, 4, 8, 10};
        int TK = 12;

        for (int coin : Coins){
            System.out.println(coin + "\t");
        }

        System.out.println("Solution: " + getNumberOfWays(TK , Coins));
    }

    private static int getNumberOfWays(int i, int[] coins) {

        int[] ways = new int[i + 1];

        ways[0] = 1;

        for (int coin : coins) {

            for (int j = 0; j < ways.length; j++) {

                if (coin <= j) {
                    ways[j] += ways[j - coin];
                    System.out.println("J = "+ j + " ways: " + ways[j]);
                }

            }

        }

        return ways[i];
    }
}
