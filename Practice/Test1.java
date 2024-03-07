package Practice;

import java.util.Arrays;

public class Test1 {



        public static void main(String[] args) {
            int[] numbers = {2, 15, 7, 10, 22, 8, 5, 13};
            findThreeElementsWithSum(numbers, 37);
        }

        public static void findThreeElementsWithSum(int[] numbers, int targetSum) {
            Arrays.sort(numbers);

            for (int i = 0; i < numbers.length - 2; i++) {
                int left = i + 1;
                int right = numbers.length - 1;

                while (left < right) {
                    int currentSum = numbers[i] + numbers[left] + numbers[right];

                    if (currentSum == targetSum) {
                        System.out.println("Elements found: " + numbers[i] + ", " + numbers[left] + ", " + numbers[right]);
                        return;
                    } else if (currentSum < targetSum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

            System.out.println("No three elements found with the given sum.");
        }
    }





