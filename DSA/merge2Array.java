package DSA;

import java.util.ArrayList;

public class merge2Array {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 6, 8};
        int[] arr2 = { 1, 2, 3};
        int[] arr3 = new int[8];
        //merge(arr1,5,arr2, 3,arr3);
        mergeSameArray(arr1,5,arr2, 3);
        printArray(arr3);

    }

    private static void printArray(int[] arr3) {
        for(int a:arr3){
            System.out.print(a);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n, int[] nums3) {

        int i = 0, j = 0, k = 0;


        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        while (i < m) {
            nums3[k++] = nums1[i++];
        }

        while (j < n) {
            nums3[k++] = nums2[j++];
        }


    }

    static void mergeSameArray(int[] nums1, int n, int[] nums2, int m){
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> list=new ArrayList();

        while (i < m && j < n) {

            if (nums1[i] != 0 && nums1[i] < nums2[j]) {
                list.add( nums1[i++]);
            } else {
                list.add( nums2[j++]);
            }


        }

        for(Integer x:list){
            System.out.println(x);
        }
    }
}
