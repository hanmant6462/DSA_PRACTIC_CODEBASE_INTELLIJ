package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndLastOccBYBinerySearchAlgo {


    public static void main(String[] args) {


            // Write your code here.

            // create int array result



            //call first
        int k=3;
        int n=5;
        int[] arr = new int[]{1, 2, 3, 3, 6,6};
        System.out.print(firstOcc(arr,n,k));
        System.out.print(lastOcc(arr,n,k));
            //return result;
        }

        public static int firstOcc(int[] arr1, int n, int key){

            int start=0;
            int end = arr1.length-1;
            int mid =start + (end-start)/2;
            int ans = -1;

            while(start<=end){
                //3 condtions first condtion mid is == to key

                if(key == arr1[mid] ){
                    ans=mid;
                    end = mid - 1;

                }

                if(key > arr1[mid]){
                    start = mid +1;
                } else if(key<arr1[mid]){
                    end = mid -1;
                }
                 mid =start + (end-start)/2;

            }
            return ans;

        }

        public static int lastOcc(int[] arr2, int n, int key){

            int start=0;
            int end = arr2.length-1;
            int mid =start + (end-start)/2;
            int ans = -1;

            while(start<=end){
                //3 condtions first condtion mid is == to key

                if(key == arr2[mid]){
                    ans=mid;
                    start = mid + 1;
                }

                if(key > arr2[mid]){
                    start = mid +1;
                } else if(key<arr2[mid]){
                    end = mid -1;
                }
                 mid =start + (end-start)/2;

            }
            return ans;

        }

    }

