package Hashing;

import java.util.ArrayList;
import java.util.List;

public class TwoPointer {
    public static void main(String[] args) {

        int n = 4, m = 4;
        int arr[] = {1, 4, 5, 7};
        int brr[] = {10, 20, 30, 40};
        int x = 32;
        List<Integer> result = printClosest(arr, brr, n, m, x);
        System.out.println(result);
    }

    //ion for finding maximum and value pair
    public static List<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = m-1;
        int first = 0;
        int second = 0;
        int closestSum = 0;
        while (i <= n-1 && j >= 0) {

            if (arr[i] + brr[j] <= x) {
                int sum = arr[i] + brr[j];
                if (sum > closestSum) {
                    closestSum = sum;
                    first = arr[i];
                    second = brr[j];
                }
                    i++;

                } else {
                    j--;
                }
            }


        result.add(closestSum);
        result.add(first);
        result.add(second);
        return result;
    }
}
