package rivision;


import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class PairSum {
    public static List<List<Integer>> findPairsWithSum(int[] arr, int S) {
        List<List<Integer>> pairs = new ArrayList<>();

        Arrays.sort(arr); // Sort the array

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == S) {
                // Found a pair with sum equal to S
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                pairs.add(pair);

                // Move left pointer to find next pair
                left++;
                // Move right pointer to find next pair
                right--;
            } else if (sum < S) {
                // If sum is less than S, move left pointer to increase sum
                left++;
            } else {
                // If sum is greater than S, move right pointer to decrease sum
                right--;
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int S = 7;

        List<List<Integer>> pairs = findPairsWithSum(arr, S);

        System.out.println("Pairs with sum " + S + ":");
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }
}
