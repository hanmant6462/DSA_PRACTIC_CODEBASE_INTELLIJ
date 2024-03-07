package DSA;

public class FindPivot {

    public static void main(String[] args) {

        int arr[] = {1,7,3,6,5,6};
        int result = getPivot(arr);
        System.out.println(result);
    }

    private static int getPivot(int[] arr) {
        int s= 0;
        int e=arr.length -1;
        int mid = s + (e-s)/2;

        while (s<e){
            if(arr[mid]>=arr[0]){
                s = mid +1;

            } else {
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
}
