package rivision;

import java.util.*;

public class DuplicateElementFinder {
    public static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // If two elements are equal, we found a duplicate
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        // If no duplicate found, return -1 or handle the case as per requirements
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        int duplicateElement = findDuplicate(arr);

        if (duplicateElement != -1) {
            System.out.println("The duplicate element is: " + duplicateElement);
        } else {
            System.out.println("No duplicate element found.");
        }
    }
}
