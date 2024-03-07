package DSA;

import java.util.Arrays;

public class rotatedArray {
}

class Main {
    public static void main(String[] args) {
        Integer[] a = {4, 2, 3, 1, 4, 3, 2, 4};
        // rotate the array to the left by 1 element
        // {2, 3, 1, 4, 3, 2, 4, 4}
        // add code here
        int temp=a[0];
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;

        System.out.println(Arrays.toString(a));
    }
}