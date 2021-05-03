package Lab_Task_1;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String search_mobile;
        boolean flag = false;

        System.out.println("Number of Mobile: ");
        int n = scanner.nextInt();

        String[] mobile_name_akash = new String[n];
        int [] mobile_price_akash = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Mobile Name: ");
            mobile_name_akash[i] = scanner.next();
            System.out.print("Mobile price: ");
            mobile_price_akash[i] = scanner.nextInt();
        }


        System.out.println("\n------Mobile List: ------");
        for (int i=0; i<n; i++){
            System.out.println("Name: " + mobile_name_akash[i] + "\t Price: " + mobile_price_akash[i]);
        }

        System.out.println("\nSearch Mobile: ");
        search_mobile = scanner.next();


        // Search
        for (int i=0; i<n; i++){
            if (mobile_name_akash[i].equals(search_mobile)){
                System.out.println("\n-----Search Result:-----\nName: " + mobile_name_akash[i] + "\nPrice: " + mobile_price_akash[i]);
                flag = true;
            }
        }

        if (!flag){
            System.out.println("\n-----Search Result:-----\nCan't find it");
        }
    }

}
