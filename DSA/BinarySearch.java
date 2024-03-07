package DSA;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=4, n=arr.length;
        int ans=binarySearch(arr,n,k);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr,int n,int k) {

        int s = 0, e = n - 1;
        int mid = s + (e - s) / 2;

        while(s<e){
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


    // find pivot
}
