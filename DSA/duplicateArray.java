package DSA;

public class duplicateArray {
    public static void main(String[] args) {


        int arr[] = {1, 1, 2, 3, 5, 2}; // {1,2,3,5}
        int result[] = {1, 1, 2, 3, 5, 2};
        for (int i = 0; i < arr.length; i++ ){
            for (int j = 1; j < arr.length -1; j++ ){
                if(arr[i] == arr[j]){
                    System.out.println(i +""+ j);
                } else {

                }
            }
        }
    }
}
