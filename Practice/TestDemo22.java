package Practice;

public class TestDemo22 {
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,0,1,0,2,0};
        int result[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                result[i] = arr[i];
            }
        }
        for(int j:result){
            System.out.print(arr[j]);
        }
    }
}
