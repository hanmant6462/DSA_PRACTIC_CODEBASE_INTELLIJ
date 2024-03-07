package rivision;

import java.util.Arrays;

public class SortArray012BruteForce {
    public static void sortArray(int[] arr) {
        int[] count = new int[3];

        // Count the occurrences of 0s, 1s, and 2s
        for (int num : arr) {
            count[num]++;
        }

        // Overwrite the original array with sorted elements
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1};
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

