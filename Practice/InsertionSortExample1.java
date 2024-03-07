package Practice;

import java.util.ArrayList;

public class InsertionSortExample1 {
    public static void insertionSort1(ArrayList<Integer> arr) {
        int n = arr.size();
        int unsortedValue = arr.get(n - 1); // Store the unsorted value

        // Find the appropriate position to insert the unsorted value
        int i = n - 2;
        while (i >= 0 && arr.get(i) > unsortedValue) {
            arr.set(i + 1, arr.get(i));
            printArrayList(arr);
            i--;
        }

        // Insert the unsorted value at the correct position
        arr.set(i + 1, unsortedValue);
        printArrayList(arr);
    }

    public static void printArrayList(ArrayList<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(3);

        insertionSort1(arr);
    }
}
