package Practice;

public class SwapNumbers {

    public static void main(String[] args) {
        int numbers [] ={1,2,3,4};
        int temp=0;
        for (int i=0;i<numbers.length-1; i++){
            temp=numbers[i];
            numbers[i]=numbers[i+1];
            numbers[i+1]=temp;

        }

        for (int j:numbers) {
            System.out.println(j);
        }
    }


}
