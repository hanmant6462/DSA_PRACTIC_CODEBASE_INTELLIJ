package Practice;

public class TestFissionDemo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};  //
        int sum=0,max=0;
        for(int i=0;i<arr.length-1;i++){
            sum=arr[i]+arr[i+1];
            if(max>sum){
                max=sum;
            }
        }
        System.out.println(sum);

    }
}
