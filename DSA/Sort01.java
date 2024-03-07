package DSA;

import java.util.* ;
import java.io.*;
public class Sort01 {
    public static void main(String[] args) {
        int[] array = {0,1,0,1,0,1,0};
        sort012(array);
    }
    public static void sort012(int[] arr)
    {
        //Write your code here

        int left=0,right=arr.length - 1;

        while(left<right){

            while(arr[left] == 0 && left<right){
                left++;
            }
            while(arr[right] == 1 && left<right){
                right--;
            }

            if(left<right){
                //swap(arr[left],arr[right]);
                int temp = arr[right];
                arr[right]=arr[left];
                arr[left] = temp;
                left++;
                right--;
            }


        }

        printArr(arr);


    }



    public static void printArr(int[] arr){
        for (int a:arr){
            System.out.print(a);
        }
    }
}