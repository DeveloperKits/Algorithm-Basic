package Greedy_Algorithm;

public class Bin_picking_problem {


    static int accommodate(int[] weight, int n, int c) {
        int result = 0, bin_rem = c;

        for (int i = 0; i < n; i++) {

            if (weight[i] > bin_rem) {
                result++;
                System.out.println("bin created : " + weight[i]);
                bin_rem = c - weight[i];
            }
            else {
                bin_rem = bin_rem - weight[i];
                System.out.println("Picked : " + weight[i]);
            }

        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] weight = { 3, 5, 6, 1, 3 };
        int Bin_Size = 6;
        int array_size = weight.length;
        System.out.println("We need " + accommodate(weight, array_size, Bin_Size) +" bins to accommodate all items ");
    }
}
