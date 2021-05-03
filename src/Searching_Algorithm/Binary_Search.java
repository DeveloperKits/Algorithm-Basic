/*
 Question:
     Search item 75 using binary search algorithm from the following list.
          A= [20, 35, 37, 40, 45, 50, 51, 67, 69, 75]
*/

package Searching_Algorithm;

import java.util.Scanner;

public class Binary_Search {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int[] A = new int[10];
          int low, high, Xm, z, mid;
          boolean flag = false;
          low = 0;
          high = A.length - 1;
          z = 51;       // When the question tells you to take it from the user, then you have to take the user input with the scanner...

          System.out.println("Enter 10 int number:");
          for (int i=0; i<A.length; i++){
              A[i] = scanner.nextInt();
          }

          do {
               mid = (low + high)/2;
               Xm = A[mid];

               if (Xm < z){
                    low = mid + 1;
               }else if (Xm > z){
                    high = high - 1;
               }else {
                    flag = true;
               }
          }while (low <= high && !flag);

          if (flag){
               System.out.println("Found");
          }else {
               System.out.println("Not Found");
          }
     }
}
