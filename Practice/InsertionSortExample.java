package Practice;

import java.util.ArrayList;

public class InsertionSortExample {
    public static void insertionSort(ArrayList<Integer> arrayList) {
        int n = arrayList.size();

        for (int i = 1; i < n; i++) {
            int key = arrayList.get(i);
            int j = i - 1;

            // Move elements of arrayList[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arrayList.get(j) > key) {
                arrayList.set(j + 1, arrayList.get(j));
                j = j - 1;
            }
            arrayList.set(j + 1, key);

            // Print the array after each iteration
            for (int k = 0; k < n; k++) {
                System.out.print(arrayList.get(k) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(1);

        insertionSort(arrayList);
    }
}
