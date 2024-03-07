package Practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr3 = {7, 1, 5, 3, 6, 4};
        int min = arr3[0],max=arr3[0];
        for(int i=1;i<arr3.length;i++){
            if(arr3[i]<min){
                 min=arr3[i];
            }
            if(arr3[i]>max){
                 max=arr3[i];
            }

        }
        //buyAtmin(min);
        //sellAtMax(max);
        System.out.println(max - min);
    }
}