package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfSubArray2 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Read the size of the array
                System.out.print("Enter the size of the array: ");
                int n = scanner.nextInt();

                // Read the array elements
                int[] array = new int[n];
                System.out.println("Enter " + n + " integers:");
                for (int i = 0; i < n; i++) {
                    array[i] = scanner.nextInt();
                }

                // Read the number of queries
                System.out.print("Enter the number of queries: ");
                int q = scanner.nextInt();

                // Process each query and calculate the sum of the subarray
                for (int i = 0; i < q; i++) {
                    System.out.print("Enter query " + (i + 1) + " (l r): ");
                    int l = scanner.nextInt();
                    int r = scanner.nextInt();

                    if (l < 0 || r >= n || l > r) {
                        System.out.println("Invalid query. Please enter valid indices.");
                    } else {
                        int sum = calculateSubarraySum(array, l, r);
                        System.out.println("Sum of subarray from index " + l + " to " + r + ": " + sum);
                    }
                }

                scanner.close();
            }





    public static int calculateSubarraySum ( int[] array, int l, int r){
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += array[i];
        }
        return sum;
    }
}

