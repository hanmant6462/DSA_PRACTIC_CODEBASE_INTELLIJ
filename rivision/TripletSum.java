package rivision;

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class TripletSum {
    public static List<List<Integer>> findTripletsWithSum(int[] arr, int K) {
        List<List<Integer>> triplets = new ArrayList<>();

        Arrays.sort(arr); // Sort the array

        int n = arr.length;

        // Fix one element (arr[i]) and find pair sum for the remaining elements
        for (int i = 0; i < n - 2; i++) {
            // To avoid duplicates, skip elements with same value
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == K) {
                    // Found a triplet with sum equal to K
                    List<Integer> triplet = Arrays.asList(arr[i], arr[left], arr[right]);
                    triplets.add(triplet);

                    // Move left pointer to find next triplet
                    left++;
                    // Move right pointer to find next triplet
                    right--;

                    // Skip duplicates to avoid duplicate triplets
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                } else if (sum < K) {
                    // If sum is less than K, move left pointer to increase sum
                    left++;
                } else {
                    // If sum is greater than K, move right pointer to decrease sum
                    right--;
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int K = 15;

        List<List<Integer>> triplets = findTripletsWithSum(arr, K);

        if (triplets.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println("Triplets with sum " + K + ":");
            for (List<Integer> triplet : triplets) {
                System.out.println(triplet);
            }
        }
    }
}
