package Practice;

public class Spectra5 {
    public static void main(String[] args) {
        int arr[] = {-3,-2,4,1,2}; // o/p = 2

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0 && arr[i] != i){
                System.out.println(i);
                break;
            }
        }
    }

}
