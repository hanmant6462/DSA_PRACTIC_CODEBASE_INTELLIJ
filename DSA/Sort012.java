package DSA;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort012 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sort012(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void sort012(List<Integer> arr){

        int low = 0,mid =0,high = arr.size() - 1;

        while (mid<=high){
            if(arr.get(mid) == 0){
                    //swap
                int temp=arr.get(mid);
                arr.set(mid ,arr.get(low));
                arr.set(low ,temp);
                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
            mid++;
            } else {
                //swap mid to high
                int temp1=arr.get(mid);
                arr.set(mid ,arr.get(high));
                arr.set(high ,temp1);
                high--;
            }
        }

    }
}
