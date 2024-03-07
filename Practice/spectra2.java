package Practice;
//Find the second largest element of the given array?
//int [] numbers = {14, 46, 47, 86, 92, 52, 48, 36, 66, 85};
//Note: Don't use any collections concepts & use a single “for” loop.
public class spectra2 {


    public static void main(String[] args) {
        int [] numbers = {14, 46, 47, 86, 92, 52, 48, 36, 66, 85};
        int max = 0;
        int secMax=0;
        for (int i =0;i<numbers.length;i++){

            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        //System.out.println(max);
        for (int i =0;i<numbers.length;i++){

            if(numbers[i]!=max && numbers[i] > secMax){
                secMax  = numbers[i];
            }
        }
        System.out.println(secMax);

    }



}
