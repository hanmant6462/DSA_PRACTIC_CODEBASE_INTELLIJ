package DSA;

public class SearchInSortedArray {

    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 3, 5};
        int k = 5;

        int result = findInSortedArray(arr, k);
        System.out.println(result);

    }

    private static int findInSortedArray(int[] arr, int k) {


        //find out pivot

        int n = arr.length;
        int pivot = getPivot(arr);
        // condition to check which line k is present
        //apply binary search
        if (k >= arr[pivot] &&  k <= arr[n-1]) {
            return binarySearch(arr, pivot, n-1, k);
        } else {
            return binarySearch(arr, 0, pivot, k);
        }


    }

    private static int binarySearch(int[] arr, int s, int e, int k) {
        {
            int mid = s + (e - s) / 2;

            while (s <= e) {
                if (k == arr[mid]) {
                    return mid;
                }

                if (k > arr[mid]) {
                    s = mid + 1;
                } else if (k < arr[mid]) {
                    e = mid - 1;
                }
                mid = s + (e - s) / 2;

            }

            return -1;
        }
    }

    private static int getPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s < e) {
            if (arr[mid] >= arr[0]) {
                s = mid + 1;

            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return s;
    }


}
