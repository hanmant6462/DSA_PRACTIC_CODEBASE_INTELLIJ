package Practice;
//arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}

//Output: arr3[] = {4, 5, 7, 8, 8, 9}
public class HclTest1 {

    public static void main(String[] args) {
        int arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8};
        int mergedArray[] = new int[arr1.length+arr2.length];
        int i=0;
        int j= 0 ;
        int k=0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i]<arr2[j]){
                mergedArray[k++]=arr1[i++];
            }else {
                mergedArray[k++]=arr2[j++];
            }
        }
        // Copy remaining elements from arr1, if any
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2, if any
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        for(int num:mergedArray){
            System.out.print(num +" ");
        }
    }


}
