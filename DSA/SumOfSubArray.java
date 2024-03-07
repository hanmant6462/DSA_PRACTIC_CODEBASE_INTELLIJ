package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfSubArray {
    public static void main(String[] args) {
       // int nums[]={1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Value");
        int num = sc.nextInt();
        int numbers[] = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        //sc.close();
        System.out.println("The integer array you entered:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Enter left and right");
        int l = sc.nextInt();
        int r = sc.nextInt();

        int sum=0;
        int prefixsum[]= new int[numbers.length];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=1;i<numbers.length;i++){
            prefixsum[i]=prefixsum[i-1]+numbers[i];
            map.put(sum,i);
        }

        int result = sumOfSubArray(map,l,r);
        System.out.println(result);
        //sumOfSubArray(nums,4,5);


    }

    private static Integer sumOfSubArray(Map<Integer,Integer> map, int l, int r) {
        if(l==0){
            return map.get(r);
        }
        return map.get(r) - map.get(l-1);
    }
}
